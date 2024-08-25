import java.util.Scanner;


class NeonNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int m=n;
		n=n*n;
		int sum=0;
		while (n>0)
		{
			sum+=n%10;
			n/=10;
		}
		if(sum==m)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");
	}
}
