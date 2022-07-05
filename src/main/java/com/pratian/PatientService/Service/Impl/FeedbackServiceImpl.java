package com.pratian.PatientService.Service.Impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pratian.PatientService.Entities.Feedback;
import com.pratian.PatientService.Repository.FeedbackRepository;
import com.pratian.PatientService.Repository.IPatientRepo;
import com.pratian.PatientService.Service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Autowired
	private IPatientRepo prepo;

	public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}

	@Override
	public Feedback saveFeedback(Feedback givefeedback) {
		// TODO Auto-generated method stub
		return feedbackRepository.save(givefeedback);
	}

	

	@Override
	public List<Feedback> getFeedback(Long id) {
		// TODO Auto-generated method stub
		return prepo.showviewallpatientById(id).getFeedback();
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
	

	
