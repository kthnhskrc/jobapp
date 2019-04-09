package com.myjob.view;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component(value = "applyView")
@Scope(value = "view")
public class ApplyView {

	@Autowired
	private JobView jv;
	
	private int newID;
	private String newTitle;
	
	private String name;
	private String surname;
	
	@PostConstruct
	public void init() {
		transferValues();
	}
	
	public void transferValues() {
		setNewID(jv.getApplyID());
		setNewTitle(jv.getApplyTitle());
	}
	
	/*public void applyJob() {
		
		final String uri = "localhost:8080/apply/create";
		
		
	}*/
	
	
	
}
