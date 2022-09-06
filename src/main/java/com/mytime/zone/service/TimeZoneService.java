/**
 * 
 */
package com.mytime.zone.service;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mytime.zone.adapter.TimeZoneAdapter;
import com.mytime.zone.dto.DateTimeJsonResponse;
import com.mytime.zone.dto.DateTimeResponse;

/**
 * @author naveen
 *
 */
@Service
public class TimeZoneService {

	@Autowired
	TimeZoneAdapter timeZoneAdapter;

	public DateTimeResponse getDateAndTime(String location, String region) {

		ResponseEntity<DateTimeJsonResponse> response = timeZoneAdapter.getDateAndTime(location, region);

		String dateTime = response.getBody().getDatetime();

		return DateTimeResponse.builder().date(OffsetDateTime.parse(dateTime).toLocalDate())
				.time(OffsetDateTime.parse(dateTime).toLocalTime().truncatedTo(ChronoUnit.SECONDS)).build();
	}
}