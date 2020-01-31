
public class ProgrammingExercise {
	
	//abebdbadebadacadeeda
	//ab = = ba
	//j = 3, i = 0
	//aba == aba
	
	//to find all the palidromes in it.
	//aba 
	 public void findPalidromes_InGivenString(String str)
	 {
		 
		 //compare first and last,decrement -sandeep
		 //
		 
		 for(int i = 0;i<str.length();i++)
		 {
			 for(int j = i+1;j<str.length();j++)
			 {
				 
				// if(str.charAt(I) == str.charAt(j))
					 
				 		String subStr = str.substring(i,j);
				 		StringBuilder sb = new StringBuilder(subStr);
						if(str.substring(i,j).equals(sb.reverse()))
						{
							
							System.out.println(subStr);
						}
				 
			 }
		 }
		 
		 
	 }
	
	

}
