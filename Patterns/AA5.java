import java.util.Scanner;

class  AA5
{
	public static void main(String[] args) 
	{
		System.out.println("Enter limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				int x = (i*(i-1))/2+1;
				for (int j=1;j<=i;j++)
				{
					System.out.print(x+"\t");
					x++;
				}
				System.out.println();
			}
			else
			{
				int x = (i*(i+1))/2;
				for (int j=1;j<=i;j++)
				{
					System.out.print(x+"\t");
					x--;
				}
				System.out.println();
			}
		}
	}
}
