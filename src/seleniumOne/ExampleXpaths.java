package seleniumOne;

import java.util.ArrayList;

public class ExampleXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,1,3,1,8,1};
		
		ExampleXpaths eE=new ExampleXpaths();
		eE.findDuplicate("ABBCCCDDDD");
		eE.findDuplicate("123654785412546325");

	}
	void findDuplicate(String arg)
	{
		ArrayList<Character> ch=new ArrayList<>();
		for(int i=0;i<arg.length();i++)
		{
			int count =0;
			char c=arg.charAt(i);
			if(!ch.contains(c))
			{
				ch.add(c);
				for(int k=i+1;k<arg.length();k++)
				{
					if(c==arg.charAt(k))
					{count++;}
				}
				System.out.println(c+ " is repeated :"+count+" times.");
			}
		}
	}
	void findDuplicate(int[] a)
	{
		ArrayList<Object> ar=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			
			if(!ar.contains(a[i]))
			{
				
				ar.add(a[i]);
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					count++;
				}
				
				System.out.println( a[i]+ "  is repeated : "+count+" times");
				
			}
			
		}
	}

}









