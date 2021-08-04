package arraytasks;

public class primenum {

	static boolean isprime(int x)
	{
		int i,m=0,flag=0;
		m=x/2;
		if(x==0 || x==1)
		{return false;}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(x%i==0)
				{
					return false;
				}
			}
		if(flag==0)
		{
			return true;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,23,34,44,50,66,79,21,29,15,67,88,97};
		for(int x:arr)
		{
			if(isprime(x))
				System.out.print(x+" ");
		}

	}

}
