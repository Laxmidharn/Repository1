import java.util.Scanner;

class Star4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		for (int i=1;i<=n;i++)
		{
			for (int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.print(i);
			System.out.println();
		}
	}
}
