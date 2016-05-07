package com.pj.testmaster.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pj.testmaster.model.Question;
import com.pj.testmaster.repository.QuestionRepository;
import com.pj.testmaster.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired private QuestionRepository questionRepository;
	
	@Override
	public List<Question> findAllQuestions() {
		return questionRepository.findAll();
	}

}
