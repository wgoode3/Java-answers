package com.hygogg.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.hygogg.lookify.models.Song;
import com.hygogg.lookify.serviices.SongService;

@Controller
public class Songs {
	
	private SongService songService;
	private String[] stars = {
		"★★★★★",
		"★★★★☆",
		"★★★☆☆",
		"★★☆☆☆",
		"★☆☆☆☆"
	};
	
	public Songs(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="q", required=false) String q) {
		if(q != null) {
			model.addAttribute("songs", songService.searchByArtist(q));
		} else {
			model.addAttribute("songs", songService.all());
		}
		model.addAttribute("song", new Song());
		model.addAttribute("top10", songService.top10());
		model.addAttribute("stars", stars);
		return "index";
	}
	
	@RequestMapping("/song/new")
	public String newSong(@Valid @ModelAttribute("song") Song song, BindingResult res, Model model) {
		if(res.hasErrors()) {
			model.addAttribute("songs", songService.all());
			model.addAttribute("top10", songService.top10());
			model.addAttribute("stars", stars);
			return "index";
		} else {
			songService.addSong(song);
		}
		return "redirect:/";
	}

	@RequestMapping("/song/{songId}/edit")
	public String editSong(@PathVariable String songId, Model model) {
		Integer id = Integer.parseInt(songId);
		Song song = songService.getById(id);
		String[] url = song.getUrl().split("/");
		model.addAttribute("yt_id", url[url.length-1]);
		model.addAttribute("stars", stars);
		model.addAttribute("song", song);
		return "song";
	}

	@RequestMapping("/song/{songId}/update")
	public String updateSong(@Valid @ModelAttribute("song") Song song, BindingResult res, Model model, @PathVariable String songId) {
		Long id = Long.parseLong(songId);
		song.setId(id);
		songService.updateSong(song);
		return "redirect:/";
	}

	@RequestMapping("/song/{songId}/delete")
	public String deleteSong(@PathVariable Long songId) {
		songService.deleteSong(songId);
		return "redirect:/";
	}

}