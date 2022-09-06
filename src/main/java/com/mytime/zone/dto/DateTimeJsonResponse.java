/**
 * 
 */
package com.mytime.zone.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author navee
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateTimeJsonResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6663158714329105676L;

	@JsonProperty("abbreviation")
	private String abbreviation = null;

	@JsonProperty("client_ip")
	private String clientIp = null;

	@JsonProperty("datetime")
	private String datetime = null;

	@JsonProperty("day_of_week")
	private Integer dayOfWeek = null;

	@JsonProperty("day_of_year")
	private Integer dayOfYear = null;

	@JsonProperty("dst")
	private Boolean dst = null;

	@JsonProperty("dst_from")
	private String dstFrom = null;

	@JsonProperty("dst_offset")
	private Integer dstOffset = null;

	@JsonProperty("dst_until")
	private String dstUntil = null;

	@JsonProperty("raw_offset")
	private Integer rawOffset = null;

	@JsonProperty("timezone")
	private String timezone = null;

	@JsonProperty("unixtime")
	private Integer unixtime = null;

	@JsonProperty("utc_datetime")
	private String utcDatetime = null;

	@JsonProperty("utc_offset")
	private String utcOffset = null;

	@JsonProperty("week_number")
	private Integer weekNumber = null;
	
	@JsonProperty("error")
	private String error = null;
}