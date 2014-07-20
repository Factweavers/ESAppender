package com.factweavers.ESlog4jAppender;

import java.util.logging.Logger;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;



public class ESAppender extends AppenderSkeleton {

	public void close() {
		System.out.println("Closing appender");		
	}

	public boolean requiresLayout() {
		return false;
	}

	@Override
	protected void append(LoggingEvent event) {
		// Push message , level , timestamp , threadName , package , fileName/line
		System.out.println("In the logger " + event.timeStamp);
		System.out.println(event.getLocationInformation());
	}

}