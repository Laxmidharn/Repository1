import java.util.Scanner;

class A1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int a = sc.nextInt();
		int b =1;

		for (int i=a;i>=1;i--)
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(b);
			}
			System.out.println();
			b++;
		}

	}
}
