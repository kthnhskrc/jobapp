package com.myjob.utility;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.myjob.model.JobModel;

public class Utility {

	public static ResponseEntity<List<JobModel>> getResponse(String url) {

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<JobModel>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<JobModel>>() {
				});

		return rateResponse;
	}
	
	
	
	



}
