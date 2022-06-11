package javaExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DublicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="TODO Auto Auto generated TODo method stub";
s=args[0];


rDubUsingSet(s);
removeDub(s);
	}

	public static void rDubUsingSet(String st)
	{
		String[] l=st.split(" ");	
		HashSet<String> hs=new HashSet<>();
		for(String s:l)
		{
		hs.add(s);
		}
		//ArrayList<String> al=new ArrayList<>(hs);
		
		System.out.println(hs);
	}
	
	public static void removeDub(String st)
	{
		String[] l=st.split(" ");
		ArrayList<String> al=new ArrayList<>();
		//boolean dup=true;
		for(int i=0;i<l.length;i++)
		{
			if(!al.contains(l[i]))
			{
				al.add(l[i]);
			}
		}
		System.out.println(al);
	}
	
	
	
	
	
	
	
	
	
}
