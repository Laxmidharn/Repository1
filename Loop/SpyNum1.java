import java.util.Scanner;


class SpyNum1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int sum=0,mul=1;
		for (int i=n;i>0;i/=10)
		{
			int r=i%10;
			sum+=r;
			mul*=r;
		}
		if(sum==mul)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
	}
}
