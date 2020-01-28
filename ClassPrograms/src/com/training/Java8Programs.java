package com.training;

import java.util.stream.IntStream;

public class Java8Programs {
	
	
	// wap palidrome  "radrara";
	public boolean checkPalindorme(String str)
	{
		
			
		
		/*for(int i = 0;i<str.length()/2;i++)
		{
				
				if(str.charAt(i) != str.charAt(str.length()-i-1))
				{
					return false;
				}
			}
			
		}*/
		
	
	return IntStream.range(0, str.length()/2).noneMatch(i->str.charAt(i) != str.charAt(str.length()-i-1));
		// find dup0licate chars in a string. //radarr-r,a
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
