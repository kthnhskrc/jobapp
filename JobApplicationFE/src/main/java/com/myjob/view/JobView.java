package com.myjob.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myjob.model.JobModel;
import com.myjob.utility.Utility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component(value = "jobView")
@Scope(value = "session")
public class JobView implements Serializable {

	private static final long serialVersionUID = 6901036085773777713L;

	private List<JobModel> allLevels;
	private List<JobModel> jobs;
	private HashMap<String, String> cbLevels;
	private String selectedLevel;
	private int applyID;
	private String applyTitle;

	public void startDataTable() {

		final String url = "http://localhost:8080/jobs/all";
		
		jobs = Utility.getResponse(url).getBody();

		/*ObjectMapper mapper = new ObjectMapper();
		
		ResponseEntity<List<JobModel>> jobs = Utility.getResponse(url);

		/*jobs = mapper.convertValue(responseForApplications.getBody(),
				new TypeReference<List<JobModel>>() {
				});
		
		cbLevels = new HashMap<String, String>();

		for (JobModel j : jobs) {
			cbLevels.put(j.getLevel(), j.getLevel());
		}
		
		for(JobModel j : jobs) {
			System.out.println(j.getLevel());
		}*/
		
	}

	@PostConstruct
	public void init() {

		startDataTable();

	}

	public void myFunc() {

		//final String levelUrl = "http://localhost:8080/jobs/" + getSelectedLevel();

		//jobs = Utility.getResponse(uri);

	}

	public String applyJob(int paramID, String paramTitle) {

		setApplyID(paramID);

		setApplyTitle(paramTitle);

		return "apply.xhtml?faces-redirect=true";

	}

}
