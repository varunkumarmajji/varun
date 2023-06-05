package com.cglia.practice;
import java.io.IOException;
import java.util.logging.*;

public class FileHandlerExample {
  private static final Logger logger = Logger.getLogger(FileHandlerExample.class.getName());

  public static void main(String[] args) throws IOException {
    FileHandler fileHandler = new FileHandler("myapp.log");
    fileHandler.setFormatter(new SimpleFormatter());
    logger.addHandler(fileHandler);

    logger.info("This is an information message");
    logger.warning("This is a warning message");
    logger.severe("This is a severe message");

    fileHandler.close();
  }
}

