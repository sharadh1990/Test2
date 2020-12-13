package stringPrograms;

public class RemoveWhiteSpace
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("I Am Removing White Spaces ");
		int size=sb.length();
		StringBuffer sb1=new StringBuffer();
		//By using another StringBuffer object
		for(int i=0;i<size;i++)
		{
			if(sb.charAt(i)==' ')
			{
				continue;
			}
			else
			{
			sb1.append(sb.charAt(i));
			}
		}
		System.out.println("After removing whitespace the string is  "+sb1);
		
		//By using same Stringbuffer object
		for(int i=0;i<size;i++)
		{
			if(sb.charAt(i)==' ')
			{
				sb.deleteCharAt(i);
				i--;
				size--;
			}
		}
		System.out.println("String after removing white space is = "+sb);
	}

}
