import java.util.Scanner;

class  PrimeAll
{
	public static boolean isPrime(int n)
	{
		if(n<=0)return false;
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)return false;
		}
		return true;
	}
	public static void range(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isPrime(i))System.out.println(i);
		}

	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		range(a,b);
	}
}
