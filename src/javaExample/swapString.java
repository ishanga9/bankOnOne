package javaExample;

import java.util.Arrays;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Kalyani";
		String b="HimankKumar";
	swapW3(a,b);
	
	//Find length
	
	lengthOfString("Lenght of String is");
	
	int[] ar= {2561,45,5236,56,84,7,0,-659,52,-6};
	largestAndSmallestNumber(ar);
	
	}
public static void swapW3(String a ,String b)
{
	//a="abc" b="123"
    //a="abc123"
	//b=0,3
	//b=abc
	//a=3
	//=123// 6  -----
	// 
	String a1="g6h67h89kij";
	
	System.out.println(a+"  ---- "+b);
	a=a.concat(b);
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("After swap");
	System.out.println(a+"  ---- "+b);
	
	}

public static void  lengthOfString(String a)
{
	char[] s=a.toCharArray();
	int i=0;
	for(char d:s)
	{
		i++;
	}
	System.out.println("Lenght of String is "+i);
	}


public static void largestAndSmallestNumber(int[] arr)
{
int largestN=arr[0];
int smallestN=arr[0];
int secondLargest=arr[0];
System.out.println(" Even number");
	for(int n:arr)
	{
		if(largestN < n)
		{secondLargest=largestN;
			largestN=n;
		}
		if( smallestN > n)
		{
			smallestN=n;
		}
		if(n%2==0)
		{
			System.out.print(n+" ");
		}
	}
	System.out.println("");
	System.out.println(Arrays.toString(arr));
 System.out.println(" Largest Number in given array is "+largestN);
 System.out.println(" Second Largest Number in given array is "+secondLargest);
 System.out.println(" Smallest Number in given array is "+smallestN);


}





}
