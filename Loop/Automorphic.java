import java.util.Scanner;


class Automorphic
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int m=n;
		int temp= n*n;
		int count=0,prod=1;
		while (n>0)
		{
			count++;
			n/=10;
		}
		for (int i=1;i<=count;i++)
		{
			prod*=10;
		}
		if (m==temp%prod)System.out.println("Automorphic Number");
		else System.out.println("Not a Automorphic Number");

	}
}