package com.pratian.PatientService.Controller;

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

import io.swagger.v3.oas.annotations.Operation;




@RestController
@CrossOrigin("*")
@RequestMapping("/givefeedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackServiceImpl feedbackservice; // 
	
	

	/*
	 * post the feedback values and return feedback values
	 */ 

//    @PostMapping
//	public ResponseEntity<GiveFeedback> saveGiveFeedback(@RequestBody GiveFeedback feedback){
//		return new ResponseEntity<GiveFeedback>(givefeedbackservice.saveGiveFeedback(feedback),HttpStatus.CREATED);
//	}
    
    @RequestMapping(value="/add",method=RequestMethod.POST) // for adding feedback we use POST method /add is the request url
    @Operation(summary = "to add feedback")
    public ResponseEntity<Feedback>createFeedback(@RequestBody Feedback pre)  {
 
        Feedback newfeedback = feedbackservice.saveFeedback(pre);// called impl class and used save feedback method and created a new feedback and saved new feedback into that
        return new ResponseEntity<>(newfeedback, HttpStatus.CREATED);
        
        
    }
    
    @PutMapping(value="/edit/{id}")// to edit the existing feedback we use PUT and /edit/{id} is the request url
    @Operation(summary = "to edit feedback using id")
    public ResponseEntity<Feedback>updateFeedback(@PathVariable("id") long id, //to use this PUT method we need to have existing data, we use feedback id to edit
    		@RequestBody Feedback pre) {
    
    return new ResponseEntity<Feedback>(feedbackservice.updateFeedback(id, pre),HttpStatus.OK);
    }
    
    @GetMapping("/get/{id}")
    @Operation(summary = "to get feedback using id")
    public ResponseEntity<Feedback> getfeedback(@PathVariable(value = "id") Long id) {
    Feedback feedbacklist = feedbackservice.getFeedback(id);
    return new ResponseEntity<>(feedbacklist, HttpStatus.OK);
    }
    
    
	
    }

