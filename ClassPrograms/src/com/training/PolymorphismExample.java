package com.training;

public class PolymorphismExample {
	
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	void sum(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
  
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
	
	double sum(float a, int b)
	{
		return a+b;
	}
	
	public void printClassName()
	{
		
		System.out.println("PolymorphismExample");
	}
	

}
