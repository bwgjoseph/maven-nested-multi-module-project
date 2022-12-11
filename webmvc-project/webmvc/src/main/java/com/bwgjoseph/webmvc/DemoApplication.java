package com.bwgjoseph.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bwgjoseph.model.Profile;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        Profile profile = Profile.builder().build();
		SpringApplication.run(DemoApplication.class, args);
	}

}
