package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public long getRoof(List<Long> cars,int k)
	{
		long size  = 0L;
		long prevSize = 0L;
		
		java.util.Collections.sort(cars);
		
		
		for(int i = 0;i<cars.size();i++)
		{
			int count = 1;
			 for(int j = i+1;j<cars.size()-1;j++) {
			
				 if(count == k)
				 { 
					 
						 
					 size = cars.get(j) - cars.get(i) + 1;	
					 if(i == 0)
						 prevSize = size;
					 
					 if(prevSize < size)
						 size = prevSize;
					 break;
				 }
				 count++;
			 }
			 
			
			
		}
		
		return size;
	}

	public static void main(String[] args) {
		
	    List<Long> list = new ArrayList<>();
	    list.add((long) 4);
	    list.add((long) 2);
	    list.add((long) 10);
	    list.add((long) 8);
	    list.add((long) 17);
	    
	    System.out.println(new Test().getRoof(list, 3));
	}
	
}
