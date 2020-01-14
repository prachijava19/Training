
public class Reversal {

	
	public static void main(String[] args) {
		//System.out.println(Reversal.reverseString("Java is awsome	"));
		//System.out.println(Reversal.reverseWordsInAString("java is awsome"));
		
		//new Reversal().sum(2,3);
	}
	
	
	public void sum(int a ,int b)
	{
		
		  System.out.println(a + b);
	}
	
	
	/*Vishal*/
	public static String reverseWordsInAString(String str)
	{
		
		if(str.length()== 0) {
			   return "";
			  }else if(str.length() == 1) {
			   return str;
			  }else if(!str.contains(" ")){
			   return reverseWordsInAString(str.substring(1, str.length())) + str.charAt(0);
			  } else {
			   return reverseWordsInAString(str.substring(0, str.indexOf(" "))) + " " + reverseWordsInAString(str.substring(str.indexOf(" ")+1));
			  }
		
		/*
		 * String str= "work is motto";
      String arr[]=str.split(" ");
      for(int i=0;i<arr.length;i++)
      {
        for(int j=arr[i].length()-1;j>=0;j--)
          {   
          System.out.print(arr[i].charAt(j));
          }
          System.out.print(" ");
		 */

	}
	
    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
       // return reverseString(str.substring(0, str.length()-1));
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
