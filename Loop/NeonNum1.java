import java.util.Scanner;


class NeonNum1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int m=n;
		n=n*n;
		int sum=0;
		for (int i=n;i>0;i/=10)
		{
			sum+=i%10;
		}
		if(sum==m)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");
	}
}
