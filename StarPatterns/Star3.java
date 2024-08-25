import java.util.Scanner;

class Star3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int value=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=n-i;j>=i;j--)
			{
				System.out.print("*"+value+"\t");
				value++;
			}
			System.out.println();
			
		}
	}
}
