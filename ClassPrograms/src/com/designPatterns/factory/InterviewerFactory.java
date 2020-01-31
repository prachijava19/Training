package com.designPatterns.factory;

public class InterviewerFactory {

	
	   public static Interviewer getInterviewer(String type)
	   {
		   switch(type)
		   {
		   case "java":
			   return new JavaInterviewer();
		   case "full" :
		   		return new FullStackInterviewer();
		   
		   default:
			   new JavaInterviewer();
		   }
		   
		   return null;
	   }
}
