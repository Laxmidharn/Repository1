import java.util.Scanner;

class A3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int a = sc.nextInt();
		for (int i=1;i<=a ;i++ )
		{
			if(i%2==0){
				for (int j=a;j>0;j-- )
				{
					System.out.print(j);
				}
				System.out.println();
			}else{
				for (int j=1;j<=a;j++ )
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
}