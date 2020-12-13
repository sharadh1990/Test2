package stringPrograms;

public class AdditionOfNumberInString 
{
	public static void main(String[] args)
	{
		String str="Sh12rad23t";
		AdditionOfNumberInString ad=new AdditionOfNumberInString();
		ad.addition(str);
	}
	public void addition(String str)
	{
		int size=str.length();
		int add=0;
		String str2="";
		for(int i=0;i<size;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				str2+=str.charAt(i);
				System.out.println("addition = "+str2);
			}
			else if(str2=="")
			{
				continue;
			}
			else
			{
				add+=Integer.parseInt(str2);
				str2="";
			}
		}
		System.out.println("Addition of digits = "+add);
	}

}

