import java.util.Scanner;


class ArmStrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int temp=n;
		int m=n;
		int sum=0,count=0;

		while (m>0)
		{
			count++;
			m/=10;
		}
		while (n>0)
		{
			int digit=n%10;
			int prod=1;
			for (int j=1;j<=count;j++)
			{
				prod*=digit;
			}
			sum+=prod;
			n/=10;
		}
		if (sum==temp) System.out.println("Armstrong Number");
		else System.out.println("Not a Armstrong Number");
		
	}
}
