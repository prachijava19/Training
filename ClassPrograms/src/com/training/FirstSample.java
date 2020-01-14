package com.training;

public class FirstSample {
	
	int id;
	String name;
	
	public FirstSample() {
		
		id = 10;
		
	}
	
	public FirstSample(int id)
	{
		
		this.id = id;
		
		
	}
	public FirstSample(int id, String name)
	{
		this();
		this.id = id;
		this.name= name;
		
	}
	
   FirstSample sum(FirstSample obj) {
	   
	   return this;
		
	}
   
   void multiply()
   {
	   System.err.println(id*10);
   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Test Sample Running");
    
    FirstSample obj2 = new FirstSample(20);
    FirstSample obj = new FirstSample(10,"Arjun"); 
   System.out.println(obj.id + obj.name);
   FirstSample obj1 = new FirstSample(20,"Shravanthi"); 
   System.out.println(obj1.id + obj1.name);

	}

}
