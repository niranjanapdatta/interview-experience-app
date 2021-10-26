package com.jobs.interviewexperienceapp.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class InterviewExperience implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long _id;
	private long intervieweeId;
	private long companyId;
	private String role;
	private long pay; // Add currency type
	private String overallExperience; // Interview Experience
	private String tips;
	private List<Round> rounds;
	
}
