package com.jobs.interviewexperienceapp.services;

import java.util.List;

import com.jobs.interviewexperienceapp.models.InterviewExperience;

public interface InterviewExperienceService {

	InterviewExperience saveInterviewExperience(InterviewExperience interviewExperience);
	
	List<InterviewExperience> findInterviewExperiences();
	
	InterviewExperience findInterviewExperience(long _id);
	
	InterviewExperience updateInterviewExperience(long _id, InterviewExperience interviewExperience);
	
	void deleteInterviewExperience(long _id);
	
	List<InterviewExperience> getInterviewExperiencesByIntervieweeId(long intervieweeId);
	
}
