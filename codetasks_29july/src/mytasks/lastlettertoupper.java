package mytasks;

public class lastlettertoupper {
	
	static String lasttoupper(String str) 
	{
		String ar[]=str.split(" ");
		int i;
		StringBuilder sb=new StringBuilder();
		
		for (int w = 0; w < ar.length; w++) {
			i=ar[w].length()-1;
			sb.append(ar[w].substring(0,i)).append(Character.toUpperCase(ar[w].charAt(i))).append(" ");
		}
		return sb.toString().trim();
	}
	public static void main(String[] args) 
	{
		System.out.println(lasttoupper("hello world i am here"));
		System.out.println(lasttoupper("good job man i was lost at this"));
	}

}
