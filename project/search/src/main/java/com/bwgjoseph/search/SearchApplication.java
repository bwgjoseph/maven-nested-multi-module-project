package com.bwgjoseph.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
        // disable workflow
        // after create mr
		SpringApplication.run(SearchApplication.class, args);
	}

}
