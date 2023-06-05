package com.cglia.practice;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter {

	@Override
	public String format(LogRecord record) {
		// TODO Auto-generated method stub
		 return String.format("[%s] %s - %s%n", record.getLevel(), record.getMessage(), record.getLoggerName());
	}

}
