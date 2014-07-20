package com.factweavers.ESlog4jAppender;

import org.apache.log4j.Logger;


public class LoggerTest {

	private static Logger logger = Logger.getLogger("Java");
	
	public static void main(String args[]){
		logger.info("Testing logger");
	}
	
}
