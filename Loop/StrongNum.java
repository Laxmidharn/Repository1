import java.util.Scanner;


class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int temp=n;
		int sum=0;

		while (n>0)
		{
			int digit=n%10;
			int prod=1;
			for (int i=1;i<=digit;i++)
			{
				prod*=i;
			}
			sum+=prod;
			n/=10;
		}
		System.out.println(sum);
		if (temp==sum)System.out.println("Strong number");
		else System.out.println("Not a Strong number");
	}
}
