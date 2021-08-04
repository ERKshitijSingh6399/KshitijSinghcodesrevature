package mycode;

public class getdomain {
	
	static String getdomainname(String str)
	{
		if(str.startsWith("https://"))
			{str=str.substring(8);}
		else
		if(str.startsWith("http://"))
		{str=str.substring(7);}
		
		int i=str.indexOf('/');
		str=str.substring(0,i);
		return str;
	}
	public static void main(String[] args) 
	{
		System.out.println(getdomainname("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(getdomainname("http://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(getdomainname("helloworld.com/wiki/Main_Page"));
		System.out.println(getdomainname("hacker.challenge.org/wiki/Main_Page"));
		
	}

}
