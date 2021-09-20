package com.htc.userservice.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Component
@FeignClient(url = "http://localhost:8084",name="bookingDetails")
public interface BookingDetails {

	@GetMapping("/bookingDetails/{bookingId}")
	BookingDetails getBookingDetailsById(@PathVariable("bookingId") Long bookingId);
}


