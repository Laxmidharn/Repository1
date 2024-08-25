import java.util.Scanner;

class PrimeNum1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag=true;

		for (int i=a;i<=b;i++)
		{
			if (i<=1) continue;
			for (int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				System.out.println(i);
			}
		}
		System.out.println("Hello World!");
	}
}
