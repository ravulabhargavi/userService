package com.htc.userservice.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Component
@FeignClient(url = "http://localhost:8089",name="centreDetails")
public interface CentreDetails {
	@GetMapping("/centreDetails/{centreId}")
	CentreDetails getCentreDetailsById(@PathVariable("centreId") Long centreId);
}
