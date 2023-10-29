package com.logger.org;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
//import org.slf4j.Logger;

public class MainLoggingExample2 {
	public static void main(String[] args) throws SecurityException,IOException {
		
		FileHandler fileHandler = new FileHandler("mylog.log");
		SimpleFormatter formatter = new SimpleFormatter();
		
		
		fileHandler.setFormatter(formatter);
		Logger logger = Logger.getLogger("MyLog");
		logger.addHandler(fileHandler);
		logger.info("This is a log message");

		
	}

}
