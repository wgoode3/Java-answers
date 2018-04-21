package com.hygogg.dojoOverflow.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.hygogg.dojoOverflow.Models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	@Query(value="SELECT * FROM question WHERE id=?1",nativeQuery=true)
	public Question getQuestionById(Long questionId);
	
}