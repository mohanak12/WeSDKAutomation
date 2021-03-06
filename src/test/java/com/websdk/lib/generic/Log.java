package com.websdk.lib.generic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log
{

	private static Logger log = Logger.getLogger(Log.class);
	private static String configFilename = System.getProperty("user.dir")
			+ "\\configurations\\Logging.properties";
	public Log() {
		PropertyConfigurator.configure(configFilename);
	}
	
	public static void info(String message)
	{
		log.info(message);
	}
	public static void warn(String message)
	{
		log.warn(message);
	}
	public static void error(String message)
	{
		log.error(message);
	}
	public static void debug(String message)
	{
		log.debug(message);
	}
	public static void fatal(String message)
	{
		log.fatal(message);
	}

}
