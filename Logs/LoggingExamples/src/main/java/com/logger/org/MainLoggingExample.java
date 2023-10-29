package com.logger.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLoggingExample {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MainLoggingExample.class);
		logger.info("This is info message");
		logger.error("This is warn message");
		logger.trace("Entering method doSomething with parameters (param1=5, param2=10)");
		logger.debug("Processing request for user ID 12345");
		logger.info("user with ID '1234' just signed in");
		logger.warn("Potential security vulnerability detected in user input: '...'");
		logger.error("Failed to connect to database: java.sql.SQLException: Connection refused");
	}

}
