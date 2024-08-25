import java.util.Scanner;

class FirstLetterOfName 
{
	public static void l(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<n;j++)
			{
				if(i==n||j==1)System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void a(int n)
	{
		int spaces= n-1,stars=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				if(i+j==n+1||j-i==n-1)
				System.out.print("*");
				else System.out.print(" ");
			}
			for (int j=i-1;j>=1;j--)
			{
				if(i+j==n+1||i==n/2||j-i==n-1)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			spaces--;
		}
	}
	public static void x(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if(i==j||i+j==n+1)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void n(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==j)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		l(n);
		x(n);
		a(n);
	}
}
