/**
 * 
 */
package com.mytime.zone.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author naveen
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DateTimeResponse {

	private LocalDate date;
	
	private LocalTime time;
}
