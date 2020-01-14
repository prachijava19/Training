package com.training;

public class StaticExample {
	
	static int count = 0;
	final int counter = 0;
	
	
	 void increment()
	{
		//counter   = 2;
		System.out.println("inside function"+ count);
	}
	
   void increment(int id)
	{
		
	}
   
   
	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
		obj.increment();
		System.out.println(obj.counter);
		StaticExample obj2 = new StaticExample();
		obj2.increment();
		System.out.println(obj2.counter);

	}

}
