import java.util.Scanner;

class PerfectNum 
{
	public static int fact(int n)
	{
		if(n<=1)return 1;
		return n*fact(n-1);
	}
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for (int i=1;i<=n/2;i++)
		{
			if(n%i==0)sum+=fact(i);
		}
		if(sum==n)return true;
		else return false;
	}
	public static void range (int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isPerfect(i))System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your range");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		range(a,b);
	}
}
