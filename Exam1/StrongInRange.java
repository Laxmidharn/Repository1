class  StrongInRange
{
	public static int factorial(int n)
	{
		if(n==0) return 1;
		return n*(factorial(n-1));
	}
	public static int isStrong(int n)
	{
		if(n==0) return 0;
		int sum=0;
		sum+=factorial(n%10);
		return sum+isStrong(n/10);
	}
	public static void range(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isStrong(i)==i)System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		int a=1,b=200;
		range(a,b);
	}
}
