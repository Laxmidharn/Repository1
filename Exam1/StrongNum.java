class StrongNum 
{
	public static int factorial(int n)
	{
		if(n==0)return 1;
		return n*factorial(n-1);
	}
	public static int isStrong(int n)
	{
		if(n==0) return 0;
		return factorial(n%10)+isStrong(n/10);

	}
	public static void main(String[] args) 
	{
		int n=145;
		System.out.println(isStrong(n));
		if(isStrong(n)==n)System.out.println(n+" is Strong");
		else System.out.println(n+" is not Strong");
	}
}
