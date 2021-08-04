package mytasks;

public class midchartoupper {
	
	static String odd(String s) 
	{
		int j;
		int i=s.length();
		StringBuilder sb=new StringBuilder();
		if(i%2==0)
		{ 
			sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1));
			return  sb.toString();}
		else
		{
			// 5     0 1 2 3 4
			j=i/2;
			sb.append(s.substring(0,j)).append(Character.toUpperCase(s.charAt(j))).append(s.substring(j+1,i));
			return sb.toString();			
		}
	}
	
	static String odduppercase(String str)
	{
		String ab;
		String ar[]=str.split(" ");
		StringBuilder kb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			ab=ar[w];
			kb.append(odd(ab)).append(" ");
		}
		return kb.toString().trim();
		
	}
	public static void main(String[] args)
	{
		System.out.println(odduppercase("hello world i am coding on zoom meeting"));
		System.out.println(odd("hello"));
		System.out.println(odd("uulluu"));
	}

}
