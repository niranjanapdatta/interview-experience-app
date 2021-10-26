package com.jobs.interviewexperienceapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

	private int number;
	private String question;
	private String answer;

}
