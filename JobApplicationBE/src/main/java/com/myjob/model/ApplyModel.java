package com.myjob.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "apply")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idapply;
	
	private int jobid;
	private String applytitle;
	private String name;
	private String surname;
	

}
