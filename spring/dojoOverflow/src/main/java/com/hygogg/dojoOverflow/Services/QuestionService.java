package com.hygogg.dojoOverflow.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygogg.dojoOverflow.Models.Question;
import com.hygogg.dojoOverflow.Repositories.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public Question create(Question question) {
		return questionRepository.save(question);
	}
	
	public Question update(Question question) {
		return questionRepository.save(question);
	}
	
	public ArrayList<Question> all() {
		return (ArrayList<Question>) questionRepository.findAll();
	}
	
	public Question getQuestionById(Long questionId) {
		return questionRepository.getQuestionById(questionId);
	}

}
