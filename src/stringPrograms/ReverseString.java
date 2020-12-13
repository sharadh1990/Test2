package stringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public final class ReverseString
{
     public static void main(String args[]) throws IOException
     {
    	 String str="My name is Sharad";
    	 ReverseString rev=new ReverseString();
    	 rev.reverse1(str);
    	 rev.reverse2(str);
    	 rev.reverse3(str);
    	 rev.reverse4(str);
     }
     //String reverse using append() 
     public void reverse1(String str)
     {
    	 int size=str.length();
    	 StringBuffer br=new StringBuffer();
    	 for(int i=size-1;i>=0;i--)
    	 {
    		 br.append(str.charAt(i));
    	 }
    	 System.out.println("Reverse string is = "+br);
     }
     //String reverse using toCharArray()
     public void reverse2(String str)
     {
    	 char arr[]=str.toCharArray();
    	 int size=arr.length;
    	 System.out.print("Reverse string is = ");
    	 for(int i=size-1;i>=0;i--)
    	 {
    		 System.out.print(arr[i]);
    	 }
    	 System.out.println();
     }
      //String reverse using toCharArray()
     public void reverse3(String str)
     {
    	 char arr[]=str.toCharArray();
    	 char temp;
    	 int size=arr.length;
    	 for(int i=0,j=size-1;i<(size/2);i++,j--)
    	 {
    		 temp=arr[i];
    		 arr[i]=arr[j];
    		 arr[j]=temp;
    	 }
    	 String str1=new String(arr);
    	System.out.println("Reverse of a String is = "+str1);
     }
     //Using ArrayList
     public void reverse4(String str)
     {
      ArrayList<Character> arr=new ArrayList<>();
      for(int i=0;i<str.length();i++)
      {
    	  arr.add(str.charAt(i));
    	  
      }
       Collections.reverse(arr);
       ListIterator<Character> li=arr.listIterator();
       System.out.print("Reverse string is = ");
       while(li.hasNext())
       {
    	   System.out.print(li.next());
       }
     }
}
