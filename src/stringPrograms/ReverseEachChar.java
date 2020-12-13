package stringPrograms;

public class ReverseEachChar 
{
	public static void main(String[] args) 
	{
		String str="I am Sharad Harish";
		String str2="";
		ReverseEachChar rev=new ReverseEachChar();
		rev.reverseEachString1(str);
		rev.reverseEachString2(str);
		char arr[]={'a','b','c'};
		System.out.print("Character array is = "+arr);
	}
	//Using inbuilt functions append/reverse
	public void reverseEachString1(String str)
	{
		System.out.println("We are going to reverse each String");
		int size=str.length();
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer();
		
		for(int i=0;i<size;i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				sb.append(str.charAt(i));
				//System.out.print(""+sb);
			}
			else
			{
				System.out.println("Not entered this"+sb1);
				sb.reverse();
				sb1.append(sb+" ");
				sb=new StringBuffer(" ");
				System.out.println("Sb1 = "+sb1);
			}
				
		}
		System.out.println("Reverse string is = "+sb1);
		
	}
	//Using Split()
	public void reverseEachString2(String str)
	{
		String str2="";
		String arr[]=str.split(" ");
		for(String str1:arr)
		{
			System.out.println("String is = "+str1);
			StringBuffer sb=new StringBuffer(str1);
			sb.reverse();
			str2+=sb.toString()+" ";
		}
		System.out.println("Reverse String = "+str2);
	}
}
