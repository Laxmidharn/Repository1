import java.util.Scanner;

class Diamond
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int n = sc.nextInt();
		int spaces=n/2;
		int stars=1;

		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		if (n<=n/2){
				
			}else{
				spaces++;
				stars-=2;
			}
		
	}
}