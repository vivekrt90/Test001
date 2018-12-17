package Package1;

public class numberOfSpaces 
{
static int i,word=0,temp;
private static numberOfSpaces number;
	   public static void main (String args[])
{
	temp=number.spacecount("Count the number of spaces in this sentence"); 
	System.out.println("The number of white spaces in the String are :  "+word);
	               }   
	   static int spacecount(String s)
	   
	   {
	       for(i=0,word=0;i<s.length();i++)
	       {
	           char ch=s.charAt(i);
	           if(ch==' ')
	           word++;
	       }
	       return word;
	   }
	   
	}
