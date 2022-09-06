/**
 * 
 */
package com.mytime.zone.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mytime.zone.dto.DateTimeJsonResponse;

/**
 * @author naveen
 *
 */
@FeignClient(url = "https://worldtimeapi.org/api/", name="${spring.application.name}")
public interface TimeZoneAdapter {

	@GetMapping(value="timezone/{location}/{region}")
	ResponseEntity<DateTimeJsonResponse> getDateAndTime(@PathVariable String location, @PathVariable String region);
	
}
