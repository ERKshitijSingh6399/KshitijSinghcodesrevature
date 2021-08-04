package mytasks;

public class palindromeline {

	
	static String palindromesentence(String str)
	{
		String ar[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for (int w = 0; w < ar.length; w++) {
			
			if(isPalindromeShortHand(ar[w])==false)
			{
				StringBuilder kb=new StringBuilder(ar[w]);
				kb.reverse();
				sb.append(kb).append(" ");
			}
			else
			{
				sb.append(ar[w]).append(" ");
			}
			
		}
		return sb.toString().trim();
	}
	
    public static boolean isPalindromeShortHand(String s) {
		
		return new StringBuilder(s).reverse().toString().equals(s);
	}
	public static void main(String[] args) {
		System.out.println(palindromesentence("hello madam i am here and my name is philihp"));
		System.out.println(palindromesentence("good job man i was lost at this"));
		}

}
