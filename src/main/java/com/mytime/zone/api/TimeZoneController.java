/**
 * 
 */
package com.mytime.zone.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytime.zone.dto.DateTimeResponse;
import com.mytime.zone.service.TimeZoneService;

/**
 * @author naveen
 *
 */
@RestController
@RequestMapping("/timezone")
public class TimeZoneController {

	@Autowired
	private TimeZoneService timeZoneService;
	
	@GetMapping("/{location}/{region}")
	public DateTimeResponse getTimeZone(@PathVariable String location, @PathVariable String region) {
		
		return timeZoneService.getDateAndTime(location, region);
	}
}