package arrayPrograms;

import java.util.Arrays;

public class findEqualityOfArray
{
	public static void main(String[] args)
	{
		int arr1[]={1,2,3};
		int arr2[]={1,2,3,4};
		findEqualityOfArray eq=new findEqualityOfArray();
		eq.arrayEquality1(arr1, arr2);
		eq.arrayEquality2(arr1, arr2);
		
	}
 //************Checking equality manually******************* 
  public void arrayEquality1(int arr1[],int arr2[])
  {
	  int size=arr1.length;
		if(arr1.length==arr2.length)
		{
			int i=0;
			for(i=0;i<size;i++)
			{
				if(arr1[i]!=arr2[i])
				break;
			}
			if(i==size)
			{
				System.out.println("Both integer arrays are equal");
			}
			else
			{
				System.out.println("Both arrays are noy equal");
			}
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}

  }
  //***********************Checking equality using Arrays's equal method********************
  public void arrayEquality2(int arr1[],int arr2[])
  {
		//****checking if arrays are equal using equals method
	  if(Arrays.equals(arr1,arr2))
		System.out.println("Both arrays are equal");
		else
		System.out.println("Arrays are not equal");
		
		//*****Converting array into String and then checking equality
		String str1=Arrays.toString(arr1);
		String str2=Arrays.toString(arr2);
		System.out.println("First = "+str1+" Second = "+str2);
		if(str1.equals(str2))
		System.out.println("Both STrings are equal");
		else
			System.out.println("Both STrings are not equal");
	  
  }
}
