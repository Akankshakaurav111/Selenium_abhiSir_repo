package com.qsp.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {

	
	//java logic 
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":","-");
	}
}
