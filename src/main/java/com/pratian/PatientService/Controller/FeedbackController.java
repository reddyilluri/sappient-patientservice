package com.pratian.PatientService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pratian.PatientService.Entities.Feedback;
import com.pratian.PatientService.Service.Impl.FeedbackServiceImpl;




@RestController
@CrossOrigin("*")
@RequestMapping("/givefeedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackServiceImpl feedbackservice; // We created an object
	
	

	/*
	 * post the feedback values and return feedback values
	 */ 

//    @PostMapping
//	public ResponseEntity<GiveFeedback> saveGiveFeedback(@RequestBody GiveFeedback feedback){
//		return new ResponseEntity<GiveFeedback>(givefeedbackservice.saveGiveFeedback(feedback),HttpStatus.CREATED);
//	}
    
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public ResponseEntity<Feedback>createFeedback(@RequestBody Feedback pre)  {
 
        Feedback newfeedback = feedbackservice.saveFeedback(pre);// 
        return new ResponseEntity<>(newfeedback, HttpStatus.CREATED);
        
        
    }
    
    @PutMapping(value="/edit/{id}")
    public ResponseEntity<Feedback>updateFeedback(@PathVariable("id") long id,
    		@RequestBody Feedback pre) {
    
    return new ResponseEntity<Feedback>(feedbackservice.updateFeedback(id, pre),HttpStatus.OK);
    }
    
    @GetMapping("/get/{id}")
    @Operation(summary = "Feedback using Patient Id")
    public ResponseEntity<List<Feedback>> getfeedback(@PathVariable(value = "id") Long id) {
    List<Feedback> feedbacklist = feedbackservice.getFeedback(id);
    return new ResponseEntity<List<Feedback>>(feedbacklist, HttpStatus.OK);
    }
    
    
	
    }

