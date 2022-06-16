package com.pratian.PatientService.Service.Impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.Feedback;
import com.pratian.PatientService.Repository.FeedbackRepository;
import com.pratian.PatientService.Service.FeedbackService;

// we use the methods and querys that we created in service interface classes and repository classes
//in-built methods //save


@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackRepository feedbackRepository; // we used autowired because we are using other classes in this class

	public FeedbackServiceImpl(FeedbackRepository feedbackRepository) { 
		super();
		this.feedbackRepository = feedbackRepository;
	}

	@Override
	public Feedback saveFeedback(Feedback givefeedbcak) {
		// TODO Auto-generated method stub
		return feedbackRepository.save(givefeedbcak);
	}

	

	@Override
	public Feedback getFeedback(Long id) {
		// TODO Auto-generated method stub
		return feedbackRepository.findByFeedId(id);
	}
	
	@Override
	public Feedback updateFeedback(long id, Feedback feedback) {
	Feedback feedback1 = feedbackRepository.findById(id).get();
	feedback1.setQ1(feedback.getQ1());
	feedback1.setQ2(feedback.getQ2());
	feedback1.setQ3(feedback.getQ3());
	feedback1.setQ4(feedback.getQ4());
	feedback1.setComment(feedback.getComment());

	return feedbackRepository.save(feedback1);
	}
}
	

	
