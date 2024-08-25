import java.util.Scanner;


class SpyNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int sum=0,mul=1;
		while (n>0)
		{
			int r=n%10;
			sum+=r;
			mul*=r;
			n/=10;
		}
		if(sum==mul)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");
	}
}
