import java.util.Scanner;

class NumberPyramid
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n-1,spaces1 = n-1;;
		for (int i=1;i<=n;i++)
		{
			int a=1;
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" \t");
			}
			for (int j=1;j<=i+(i-1);j++)
			{
				if (j<=i)
				{
					System.out.print(a+"\t");
					a++;
				}
				else
				{
					a--;
					System.out.print(a-1+"\t");
				}
			}
			System.out.println();
			spaces--;
		}
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces1;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}`
			for (int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			spaces1--;
		}
	}
}
	