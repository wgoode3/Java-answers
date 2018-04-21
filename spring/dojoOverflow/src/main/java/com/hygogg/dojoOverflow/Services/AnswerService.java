package com.hygogg.dojoOverflow.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hygogg.dojoOverflow.Models.Answer;
import com.hygogg.dojoOverflow.Repositories.AnswerRepository;

@Service
public class AnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public Answer create(Answer answer) {
		return answerRepository.save(answer);
	}
	
}