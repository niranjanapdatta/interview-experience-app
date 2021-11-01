package com.jobs.interviewexperienceapp.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<InterviewExperience> postInterviewExperience(@RequestBody InterviewExperience interviewExperience) {
		return new ResponseEntity<InterviewExperience>(interviewExperienceService.saveInterviewExperience(interviewExperience), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<InterviewExperience> getInterviewExperiences() {
		return interviewExperienceService.findInterviewExperiences();
	}

	@GetMapping("/{_id}")
	public ResponseEntity<InterviewExperience> getInterviewExperienceById(@PathVariable("_id") long _id) {
		return new ResponseEntity<InterviewExperience>(interviewExperienceService.findInterviewExperience(_id), HttpStatus.OK);
	}

	@GetMapping("/interviewee/{intervieweeId}")
	public List<InterviewExperience> getInterviewExperiencesByIntervieweeId(@PathVariable("intervieweeId") long intervieweeId) {
		return interviewExperienceService.getInterviewExperiencesByIntervieweeId(intervieweeId);
	}
	
	@PutMapping("/{_id}")
	public ResponseEntity<InterviewExperience> putInterviewExperience(@PathVariable("_id") long _id, @RequestBody InterviewExperience interviewExperience) {
		return new ResponseEntity<InterviewExperience>(interviewExperienceService.updateInterviewExperience(_id, interviewExperience), HttpStatus.CREATED);
	}

	@DeleteMapping("/{_id}")
	public ResponseEntity<String> deleteInterviewExperience(@PathVariable("_id") long _id) {
		interviewExperienceService.deleteInterviewExperience(_id);
		
		return new ResponseEntity<String>("Deleted Interview Experience with _id: " + _id, HttpStatus.OK); 
	}
	
}
