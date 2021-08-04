package arraytasks;

public class numpalindrome {

	static boolean ispalindrome(int x) 
	{
		String str=Integer.toString(x);
		StringBuffer sb= new StringBuffer(str);
		sb=sb.reverse();
		//System.out.println(str+" "+sb.toString());
		if(str.equals(sb.toString()))
		{return true;}
		else
			return false;
	}
	public static void main(String[] args) {
		int arr[]= {111,212,34,404,5050,6006,789987,1221,123312,141441415,676,88,9};
		for(int x:arr)
		{
			if(ispalindrome(x))
				System.out.print(x+" ");
		}

	}

}
