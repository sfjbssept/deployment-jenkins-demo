package com.jenkins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication implements CommandLineRunner {

	public static final Logger Logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	public static void main(String[] args) {
		Logger.info("This is a CI job");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger.info("this is the second task of this build");

	}

}
