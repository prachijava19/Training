import java.util.HashMap;
import java.util.Map;

public class Sample {
	
public int getTime(String str)
{
	int time = 0;
	Map<Character,Integer> dMap = new HashMap<Character, Integer>(){{
		put('A',1);
		put('B',2);
		put('C',3);
		put('D',4);
		put('E',5);
		put('F',6);
		put('G',7);
		put('H',8);
		put('I',9);
		put('J',10);
		put('K',11);
		put('L',12);
		put('M',13);
		put('N',14);
		put('O',15);
		put('P',16);
		put('Q',17);
		put('R',18);
		put('S',19);
		put('T',20);
		put('U',21);
		put('V',22);
		put('W',23);
		put('X',24);
		put('Y',25);
		put('Z',26);
	}};
	int path1 = 0;
	int path2 = 0;
	int val = 0;
	int prev = 1;
	int n = dMap.size();
	//BZA
	for(char c : str.toCharArray())
	{
		 val = dMap.get(c);//26,1
		 path1 = val > prev ? val - prev: prev - val;//24,-25
		 path2 = n-path1;//path1 > 0 ? n-path1 : n+path1;//2
		
		if(path1 < path2 && path1 >= 0)
		  time+=path1;
		else
			time+=path2;//3
		
		prev = val; //2,26
		
	}

return time;

}

public static void main(String[] args) {
	System.out.println(new Sample().getTime("ALOK"));
}

}
