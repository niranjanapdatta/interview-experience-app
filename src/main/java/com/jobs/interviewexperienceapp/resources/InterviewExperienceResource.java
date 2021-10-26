package com.jobs.interviewexperienceapp.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.interviewexperienceapp.models.InterviewExperience;
import com.jobs.interviewexperienceapp.services.InterviewExperienceService;

@RestController
@RequestMapping("/interview-experiences")
public class InterviewExperienceResource {

	private InterviewExperienceService interviewExperienceService;

	public InterviewExperienceResource(InterviewExperienceService interviewExperienceService) {
		super();
		this.interviewExperienceService = interviewExperienceService;
	}

	@PostMapping
	public InterviewExperience postInterviewExperience(@RequestBody InterviewExperience interviewExperience) {
		System.out.println(interviewExperience.toString());
		return interviewExperienceService.saveInterviewExperience(interviewExperience);
	}
	
	@GetMapping
	public List<InterviewExperience> getInterviewExperiences() {
		return interviewExperienceService.findInterviewExperiences();
	}
	
}
