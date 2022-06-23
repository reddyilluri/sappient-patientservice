package com.pratian.PatientService.Service;

import java.util.List;




import org.springframework.stereotype.Service;

import com.pratian.PatientService.Entities.Feedback;

@Service
public interface FeedbackService {
	
	Feedback updateFeedback(long id,Feedback feedback);
	
	Feedback saveFeedback(Feedback feedbcak);
	
	public List<Feedback> getFeedback(Long id);
	

}

