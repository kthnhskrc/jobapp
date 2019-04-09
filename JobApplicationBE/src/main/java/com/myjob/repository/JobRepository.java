package com.myjob.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.myjob.model.JobModel;

public interface JobRepository extends CrudRepository<JobModel, Integer>{

	@Transactional
	Iterable<JobModel> findByLevel(String level);

	@Transactional
	@Query("SELECT DISTINCT level from JobModel")
	Iterable<JobModel> findOnlyLevels();

	

}
