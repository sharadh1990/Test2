 package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar 
{
	public static void main(String[] args)
	{
		DuplicateChar dp=new DuplicateChar();
		dp.findDuplicateChar1("Sharad");
		dp.findDuplicateChar2("I am Shadrada ");
	}
   //**********************Using charAt() and deleteChar()**********//
	public void findDuplicateChar1(String str)
	{
		  StringBuffer sb=new StringBuffer(str);
		  
		  int size=str.length();
		  for(int i=0;i<size-1;i++)
		  {
			  int temp=1;
			  for(int j=i+1;j<size-1;j++)
			  {
				   
				  if(sb.charAt(i)==sb.charAt(j))
				  {
					  temp++;
					  sb.deleteCharAt(j);
					  j--;
					  size=sb.length();
					
				  }
				  
			  }
			  if(temp>1)
			  {
				System.out.println(sb.charAt(i)+" occured "+temp+" times");  
			  }
			  temp=1;
		  }
	}
	//***************Using Map**************************//
	public void findDuplicateChar2(String str)
	{
		//String str="Sharad";
		
		HashMap<Character,Integer> mp =new HashMap<>();
		int size=str.length();
		int count=0;
		
		for(int i=0;i<size;i++)
		{
		  if (mp.containsKey(str.charAt(i)))
		  {
			  count=mp.get(str.charAt(i));
			  
			  mp.put(str.charAt(i), ++count);
		  }
		  else
		  {
			  mp.put(str.charAt(i), 1);
		  }
		  
		}
		System.out.println("Duplicate characteres with it's count = "+mp);
	}
}
