package stringPrograms;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str="Madam";
		StringBuffer sb=new StringBuffer();
		
		int size=str.length();
		int count=0;
		for(int i=0,j=size-1;i<(size/2);i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				count++;
				
			}
			//System.out.println("i = "+str.charAt(i)+"j = "+str.charAt(j)+"count "+count);
			//System.out.println("j = "+str.charAt(j));
			
		}
		if(count==(size/2)-(1))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}
		
		//By appending character to stringbuffer object
		for(int i=size-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		System.out.println("String is = "+sb);
		String str1=new String(sb);
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}
	}

}
