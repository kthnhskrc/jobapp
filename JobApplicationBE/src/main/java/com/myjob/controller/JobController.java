package com.myjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.model.JobModel;
import com.myjob.repository.JobRepository;

@Controller
@RequestMapping(path = "/jobs")
public class JobController {

	@Autowired
	private JobRepository jobRepository;

	@GetMapping(path = "/all")
	@ResponseBody
	public Iterable<JobModel> getAllValues() {
		return jobRepository.findAll();

	}

	@GetMapping(path = "/{level}")
	@ResponseBody
	public Iterable<JobModel> getFromLevel(@PathVariable String level) {
		return jobRepository.findByLevel(level);
	}
	
	@GetMapping(path="/all-levels")
	@ResponseBody
	public Iterable<JobModel> getOnlyLevels(){
		return jobRepository.findOnlyLevels();
	}
	
	
	
	
	

}
