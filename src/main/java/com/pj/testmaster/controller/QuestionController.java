package com.pj.testmaster.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pj.testmaster.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		Map<String, Object> model = new HashMap<>();
		model.put("questions", questionService.findAllQuestions());
		
		return new ModelAndView("question/list", model);
	}

}
