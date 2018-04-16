package com.hygogg.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hygogg.lookify.models.Song;
import com.hygogg.lookify.serviices.SongService;

@Controller
public class Songs {
	
	private SongService songService;
	private String[] stars = {"★★★★★","★★★★☆","★★★☆☆","★★☆☆☆","★☆☆☆☆"};
	
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
		System.out.println(song.getTitle());
		if(res.hasErrors()) {
			model.addAttribute("songs", songService.all());
			model.addAttribute("top10", songService.top10());
			return "index";
		} else {
			songService.addSong(song);
		}
		return "redirect:/";
	}

}
