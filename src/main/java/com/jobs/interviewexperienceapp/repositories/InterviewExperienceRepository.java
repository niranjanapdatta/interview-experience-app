package com.jobs.interviewexperienceapp.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.jobs.interviewexperienceapp.models.InterviewExperience;

public interface InterviewExperienceRepository extends MongoRepository<InterviewExperience, Long>{

	@Query("{intervieweeId:?0}")
	List<InterviewExperience> findInterviewExperiencesByIntervieweeId(long intervieweeId);
	
}
