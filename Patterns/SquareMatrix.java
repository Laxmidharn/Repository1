import java.util.Scanner;

class SquareMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int a = sc.nextInt();

		for (int i=1;i<=a ;i++ )
		{
			for (int j=1;j<=a ;j++ )
			{
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
