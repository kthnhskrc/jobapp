package com.myjob.utility;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.myjob.model.JobModel;

public class Utility {

	public static <T> ResponseEntity<List<T>> getResponse(String url) {

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<T>> rateResponse = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<T>>() {
				});

		return rateResponse;
	}
	
	
	
	



}
