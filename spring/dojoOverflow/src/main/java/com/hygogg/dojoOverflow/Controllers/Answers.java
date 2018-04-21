package com.hygogg.dojoOverflow.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hygogg.dojoOverflow.Models.Answer;
import com.hygogg.dojoOverflow.Services.AnswerService;
import com.hygogg.dojoOverflow.Services.QuestionService;

@Controller
public class Answers {
	
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerService answerService;
	
	public Answers(QuestionService questionService, AnswerService answerService) {
		this.questionService = questionService;
		this.answerService = answerService;
	}

	@RequestMapping("/question/{questionId}")
	public String index(@PathVariable Long questionId, Model model) {
		model.addAttribute("question", questionService.getQuestionById(questionId));
		return "question";
	}
	
	@RequestMapping("/answer/{questionId}")
	public String answer(@PathVariable Long questionId, 
			@RequestParam(value="answer") String answer, 
			RedirectAttributes flash) {
		System.out.println(answer);
		if(answer.length() < 12) {
			flash.addFlashAttribute("error", "Answer must be 12 characters or more!");
		} else {
			Answer newAnswer = new Answer(answer);
			newAnswer.setQuestion(questionService.getQuestionById(questionId));
			answerService.create(newAnswer);
		}
		return String.format("redirect:/question/%d", questionId);
	}
	
}
