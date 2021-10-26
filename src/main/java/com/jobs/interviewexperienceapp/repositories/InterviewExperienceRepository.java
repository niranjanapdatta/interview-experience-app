package com.jobs.interviewexperienceapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobs.interviewexperienceapp.models.InterviewExperience;

public interface InterviewExperienceRepository extends MongoRepository<InterviewExperience, Long>{

}
