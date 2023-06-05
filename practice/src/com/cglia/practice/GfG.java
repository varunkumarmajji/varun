package com.cglia.practice;


import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class GfG {
	public static void main(String[] args) {
		try {
		 Logger logger = Logger.getLogger(GfG.class.getName());
		 logger.info("i am error....");
		
		 Handler consoleHandler = new ConsoleHandler();
		 logger.addHandler(consoleHandler);
		 logger.info("This is an information message");
		}
		catch(Exception ex)
		{
			
		}
	}
}
