package mycode;

public class checkifsecure {
	static String checksecure(String str)
	{
		if(str.startsWith("https://"))
			{return "secure";}
		else
		if(str.startsWith("http://"))
		{return "not secure";}
		
		return "not secure";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(checksecure("helloworld.com/wiki/Main_Page"));
		System.out.println(checksecure("hacker.challenge.org/wiki/Main_Page"));
		
	}
}
