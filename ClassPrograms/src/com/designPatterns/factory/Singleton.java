package com.designPatterns.factory;

public class Singleton implements Cloneable{
	
	private static Singleton instance;
	
	private Singleton()
	{ 
		
	}
	
  
	 public static Singleton getInstance()
	 {
		 if(instance == null) {
		 		 instance = new Singleton();
		 }
		 return instance;
	 }
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
}
