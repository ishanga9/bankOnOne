package javaExample;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class AnagramExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a word, phrase, or name formed by rearranging the letters of another, 
		//such as spar, formed from rasp.
		
		

String [][] a={
{"dormitory","dirty room"},
{"a gentleman","elegant man"},
{"astronomer","moon starer"},
{"Christmas","trims cash"},
{"conversation","voices rant on"},
{"eleven plus two","twelve plus one"},
{"Fourth of July","joyful Fourth"},
{"listen","silent"},
{"schoolmaster","the classroom"},
{"slot machines","cash lost in 'em"},
{"snooze alarms","alas, no more Z's"},
{"the detectives","detect thieves"},
{"the eyes","they see"},
{"the Morse Code","here come dots"},
{"vacation time","I am not active"}};


//simple anagram 
System.out.println("Simple anagram example");
simpleAnagram("listen","silent");
System.out.println("==============================");
for(int i=0;i<a.length;i++)
{
	
	if(isAnagram(a[i]))
	{
		System.out.println(" Words are anagram " +a[i][0]+" --- "+a[i][1]);
		
	}
	else
	{
		System.out.println("===================================");
		System.out.println(" Words are not anagram " +a[i][0]+" ----"+a[i][1]);
		System.out.println("===================================");
	}
}
	}
	
	public static boolean isAnagram(String[] phrase )
	{
		boolean checkAnagram=false;
		
	char[] ch;
	String str2;
	
	
	
	int len;
	if(phrase[0].length() >= phrase[1].length())
	{
		len=phrase[0].length();
		ch=phrase[0].trim().toLowerCase().toCharArray();
		str2=phrase[1].trim().toLowerCase() ;
	}
	else {
		len=phrase[1].length();
		ch=phrase[1].trim().toLowerCase().toCharArray();
		str2=phrase[0].trim().toLowerCase() ;
	}
	System.out.println(" len value is "+len);
	for(int i=0;i<len;i++)
		{
		if((ch[i]>=97 && ch[i]<=122 ) || (ch[i] >=48 && ch[i]<=57))
		{
			if(str2.contains(ch[i]+""))
			{
			checkAnagram=true;
			}
				else
				{
					checkAnagram=false;
				break;
					
				}
		}else if( ch[i] ==32)
		{
			
		}
		
		}
		return checkAnagram;
	}

	
	public static void simpleAnagram(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println(" Strings are not Anagram");
		}
		else {
			char[] ch=str1.toLowerCase().toCharArray();
			str2=str2.toLowerCase();
			
			
			boolean check=true;
			for(int i=0;i<str2.length();i++)
			{
				if(!str2.contains(String.valueOf(ch[i])))
				{
					check=false;
					break;
				}
			}
			if(check)
			{
				System.out.println("Strings are Anagram "+str1+"  "+str2);
			}
			else
			{
				System.out.println("Strings are not Anagram "+str1+"  "+str2);
			}
		}
	}
	
	
	
	
	
	
	
}
