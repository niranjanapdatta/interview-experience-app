package com.jobs.interviewexperienceapp.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Round{
	
	private int number;
	private String name;
	private String description;
	private int minutes;
	private String experience; // Interview Experience
	private List<Question> questions;
	
}
