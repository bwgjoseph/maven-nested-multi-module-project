package com.bwgjoseph.dependsonmigration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bwgjoseph.migration.Migration;

@SpringBootApplication
public class DependsOnMigrationApplication {

	public static void main(String[] args) {
		Migration migration = new Migration();
		SpringApplication.run(DependsOnMigrationApplication.class, args);
	}

}
