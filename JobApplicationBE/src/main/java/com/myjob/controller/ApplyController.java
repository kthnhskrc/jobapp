package com.myjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myjob.model.ApplyModel;
import com.myjob.repository.ApplyRepository;

@Controller
@RequestMapping(path="/apply")
public class ApplyController {
	
	
	@Autowired
	private ApplyRepository applyRepository;
	
	@ResponseBody
	@GetMapping(path="/all")
	public Iterable<ApplyModel> showAll(){
		
		return applyRepository.findAll();
	}
	
	@ResponseBody
	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public void applyJob(@RequestBody ApplyModel a) {
		applyRepository.save(a);
	}
	

}
