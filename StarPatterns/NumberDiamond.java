import java.util.Scanner;

class NumberDiamond 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int spaces = n/2;
		
		for (int i=1;i<=n;i++)
		{
			int num = 1;
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			for (int j=i-1;j>=1;j--)
			{
				System.out.print(num-2);
				num--;
			}
			System.out.println();
			if (i<=n/2)
			{
				spaces--;
				num+=2;
			}
			else
			{
				spaces++;
				num-=2;
			}
		}
	}
}
	