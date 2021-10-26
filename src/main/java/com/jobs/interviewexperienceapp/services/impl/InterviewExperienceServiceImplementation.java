package com.jobs.interviewexperienceapp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobs.interviewexperienceapp.exceptions.CustomException;
import com.jobs.interviewexperienceapp.models.InterviewExperience;
import com.jobs.interviewexperienceapp.repositories.InterviewExperienceRepository;
import com.jobs.interviewexperienceapp.services.InterviewExperienceService;


@Service
public class InterviewExperienceServiceImplementation implements InterviewExperienceService {
	
	private InterviewExperienceRepository interviewExperienceRepository;

	public InterviewExperienceServiceImplementation(InterviewExperienceRepository interviewExperienceRepository) {
		super();
		this.interviewExperienceRepository = interviewExperienceRepository;
	}

	@Override
	public InterviewExperience saveInterviewExperience(InterviewExperience interviewExperience) {
		return interviewExperienceRepository.save(interviewExperience);
	}

	@Override
	public List<InterviewExperience> findInterviewExperiences() {
		return interviewExperienceRepository.findAll();
	}

	@Override
	public InterviewExperience findInterviewExperience(long _id) {
		return interviewExperienceRepository.findById(_id).orElseThrow(() -> new CustomException("Interview Experience", "_id", _id));
	}

	@Override
	public InterviewExperience updateInterviewExperience(long _id, InterviewExperience interviewExperience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInterviewExperience(long _id) {
		// TODO Auto-generated method stub
		
	}
	
}
