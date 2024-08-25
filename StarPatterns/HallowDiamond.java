import java.util.Scanner;

class HallowDiamond 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int stars=1,spaces=n/2;

		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=stars;k++)
			{
				if (k==1 || k==stars)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if (i<=n/2)
			{
				spaces--;
				stars+=2;
			}
			else
			{
				spaces++;
				stars-=2;
			}
		}
	}
}
	