import java.util.Scanner;

class  A6
{
	public static void main(String[] args) 
	{
		System.out.println("Enter limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=1;i<=n;i++)
		{
			for (int j=n;j>=i;j--)
			{
				System.out.print(j);
				for (int k=n;j>i;j--)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
