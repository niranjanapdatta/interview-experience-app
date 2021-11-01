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
		InterviewExperience existingInterviewExperience = findInterviewExperience(_id);
		
		existingInterviewExperience.setIntervieweeId(interviewExperience.getIntervieweeId());
		existingInterviewExperience.setCompanyId(interviewExperience.getCompanyId());
		existingInterviewExperience.setRole(interviewExperience.getRole());
		existingInterviewExperience.setPay(interviewExperience.getPay());
		existingInterviewExperience.setOverallExperience(interviewExperience.getOverallExperience());
		existingInterviewExperience.setTips(interviewExperience.getTips());
		existingInterviewExperience.setRounds(interviewExperience.getRounds());
		
		return interviewExperienceRepository.save(existingInterviewExperience);
	}

	@Override
	public void deleteInterviewExperience(long _id) {
		findInterviewExperience(_id);
		
		interviewExperienceRepository.deleteById(_id);
	}

	@Override
	public List<InterviewExperience> getInterviewExperiencesByIntervieweeId(long intervieweeId) {
		return interviewExperienceRepository.findInterviewExperiencesByIntervieweeId(intervieweeId);
	}
	
}
