package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	// Here we read each and every value from a config.properties file and then give that values to a baseclass
	
	
	Properties pro;
	
	public ReadConfig()
	{
		
		File src = new File("./Configuration/config.properties");  // reading a data from a config.properties
		
		try
		{
			FileInputStream fis = new FileInputStream(src);    // opening a file in read mode
			pro = new Properties();
			pro.load(fis);           // loading a complete file at runtime
			
		} catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	// below we make a method to get the values from a config.properties file, for every variable which is defined in .properties file, we create-
	// different method for every variable
	
	  public String getApplicationURL()
	  {
		  String url = pro.getProperty("baseURL");   // here we read the value from a config.properties file and then return that value
		  return url;
		  
	  }
	  
	  
	  
	  public String getUsername()
	  {
		  
		  String username = pro.getProperty("username");    // here we read the value from a config.properties file and then return that value
		  return username;
	  }
	
	  
	  public String getPassword()
	  {
		  
		  String password = pro.getProperty("password");  // here we read the value from a config.properties file and then return that values
		  return password;
	  }
	  
	  
	  public String getChromePath()
	  {
		  
		  String chromepath = pro.getProperty("chromepath");  // here we read the value from a config.properties file and then return that value
		  return chromepath;
	  }
	  
	  
	  public String getEdgePath()
	  {
		  
		  String edgepath = pro.getProperty("edgepath");  // here we read the value from a config.properties file and then return that value
		  return edgepath;
	  }
	  
	  
	  
	  public String getFirefoxPath()
	  {
		  
		  String firefoxpath = pro.getProperty("firefoxpath");   // here we read the value from a config.properties file and then return that value
		  return firefoxpath;
	  }
	
	
	
	
	 
	

}
