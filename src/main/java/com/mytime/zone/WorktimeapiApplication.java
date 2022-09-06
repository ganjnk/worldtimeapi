package com.mytime.zone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WorktimeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorktimeapiApplication.class, args);
	}

}
