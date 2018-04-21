package com.hygogg.dojoOverflow.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hygogg.dojoOverflow.Models.Question;
import com.hygogg.dojoOverflow.Models.Tag;
import com.hygogg.dojoOverflow.Services.QuestionService;
import com.hygogg.dojoOverflow.Services.TagService;

@Controller
public class Questions {
	
	@Autowired
	private QuestionService questionService;
	@Autowired
	private TagService tagService;
	
	public Questions(QuestionService questionService, TagService tagService) {
		this.questionService = questionService;
		this.tagService = tagService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("questions", questionService.all());
		return "index";
	}
	
	@RequestMapping("/question/new")
	public String new_question() {
		return "newquestion";
	}
	
	@RequestMapping("/question")
	public String question(@RequestParam(value="question") String question, 
			@RequestParam(value="tags") String tags,
			RedirectAttributes flash) {
		String[] listOfTags = tags.split(" ");
		ArrayList<String> errors = new ArrayList<String>();
		ArrayList<Tag> valid_tags = new ArrayList<Tag>();
		for(int i=0; i<listOfTags.length; i++) {
			if(listOfTags[i].length() > 2) {
				valid_tags.add(tagService.create(new Tag(listOfTags[i])));
			}
		}
		
		if(question.length() < 12) {
			errors.add("The question must be 12 characters or longer");
		}
		if(tags.length() == 0) {
			errors.add("There are no valid tags, tags must be 2 characters or more and seperated by spaces");
		}
		
		if(errors.size() > 0) {	
			flash.addFlashAttribute("errors", errors);
			return "redirect:/question/new";
		} else {
			Question question1 = questionService.create(new Question(question));
			question1.setTags(valid_tags);
			questionService.update(question1);
			return "redirect:/";
		}
		
	}
	
}
