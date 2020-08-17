import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interviews {
	

	 
	public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		 
		  
		int num = 5341;
        String number = Integer.toString(num);
        int len = number.length(); 
        int[] digitsArray = new int[len];
        int i = 0;
         while (num != 0)
         {
             int digit = num % 10;
             digitsArray[i++] = digit; 
             num = num / 10;
         }
	    
         bubbleSort(digitsArray);
	   
	}
}
