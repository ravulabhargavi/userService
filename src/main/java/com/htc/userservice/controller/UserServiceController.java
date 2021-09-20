package com.htc.userservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.htc.userservice.externalservice.BookingDetails;
import com.htc.userservice.externalservice.CentreDetails;



@RestController
public class UserServiceController {

	@Autowired
	BookingDetails bookingDetails;
	@Autowired
	CentreDetails centreDetails;
	private static final Logger logger=LoggerFactory.getLogger(UserServiceController.class);
	@GetMapping("/booking_service/bookingDetails/{bookingId}")
	BookingDetails getBookingDetailsById(@PathVariable Long bookingId){
		logger.toString();
		return bookingDetails.getBookingDetailsById(bookingId);
		
	}
	@GetMapping("/centreDetails/details/{centreId}")
	CentreDetails getCentreDetailsById(@PathVariable Long centreId){
		logger.toString();
		return centreDetails.getCentreDetailsById(centreId);
		
	}
}
