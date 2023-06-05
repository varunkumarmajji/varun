package com.cglia.practice;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerExample {
	// creating logger objects
	private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());
	private static final Logger logger2 = Logger.getLogger(LoggerExample.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		System.out.println(logger.getName());
		System.out.println(logger2.getName());
		// using logger object
		logger.info("Starting application file...");
		logger2.info("starting...... console...");
		
		logger.setLevel(Level.CONFIG);

		// creating handler objects
		Handler consoleHandler = new ConsoleHandler();
		Handler fileHandler = new FileHandler(
				System.getProperty("user.dir") + System.getProperty("file.separator") + "MyLogFile.log", true);

		// setting formatter for handlers...
		consoleHandler.setFormatter(new MyFormatter());
		fileHandler.setFormatter(new SimpleFormatter());

		// adding handler to logger object
		logger.addHandler(fileHandler);
		logger2.addHandler(consoleHandler);

		int x = 10;
		int y = 0;
		try {
			int z = x / y;
			System.out.println(z);
			System.out.println(logger.getName());
			
		} catch (ArithmeticException ex) {
			logger.log(Level.SEVERE, "Exception occurred file...", ex);
			logger2.log(Level.SEVERE, "Exception occurred console....", ex);
		
		}

		logger.warning("Exiting application file....");
		logger2.warning("exiting.... console...");
	}
}
