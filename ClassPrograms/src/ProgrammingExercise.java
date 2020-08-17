import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ProgrammingExercise {
	private int num = 10;
	private static String name = "Ram";
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
	
	 void moveZeroesToCenter(int[] arr)
	 {
		 
		int mid = arr.length/2;
		
		 for(int i = 0;i<arr.length/2;i++)
		 {
			 int temp = arr[i];
			 if(temp == 0 && arr[mid] !=0)
			 {
				 arr[i] = arr[mid];
				 arr[mid] = temp;
				 int j = i+1;
				 while(j < mid)
				 {
					 int temp2 = arr[j];
					 
				 }
			 }
		 }
	 }
	
	static void show(String name) {
		System.out.println(name);
	}
	 public static void main(String[] args) {
		 
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
	}

}
