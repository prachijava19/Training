package com.training;

public class OverridingExample extends PolymorphismExample{
	
	OverridingExample()
	{
		
		
		super();
	}
	
	public void printClassName()
	{
		
		System.out.println("OverridingExample");
	}
	
	public static void main(String[] args) {

			    
         new PolymorphismExample().printClassName();
         new OverridingExample().printClassName();

		}
}
