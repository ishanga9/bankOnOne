package javaExample;

public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="TODO Auto-generated method stub";
		System.out.println(a);
System.out.println(revString(a));
seggregateCharacters("gftdy)(+TTTTUghf1/5d6W2@h&99dKZ#$%");
	}

	
	public static String revString(String a)
	{
		String rev="";
		char[] ca=a.toCharArray();
		for(int i=ca.length-1;i>=0;i--)
		{
			rev=rev+ca[i];
		}
		
		return rev;
	}
	
	static void seggregateCharacters(String a)
	{
		String capLetters="";
		String smallLetters="";
		String specialChars="";
		String num="";
		char[] ch=a.toCharArray();
		for(char c:ch)
		{
			if(c>=48 && c<=57)
			{
				num+=c;
			}else if(c>=97 && c<=122)
			{
				smallLetters+=c;
				
			}
			else if(c>=65 && c<=90)
			{
				capLetters+=c;
			}
			else
			{
				specialChars+=c;
			}
		}
		System.out.println(a);
		System.out.println("Capital Letters in string are :"+capLetters);
		System.out.println("Small Letters in string are :"+smallLetters);
		System.out.println("Numbers in string are :"+num);
		System.out.println("Special Letters in string are :"+specialChars);
	}
	
	
	
	
	
	
	
}
