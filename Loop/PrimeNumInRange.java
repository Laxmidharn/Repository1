import java.util.Scanner;


class  PrimeNumInRange
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		for (int i=a;i<=b;i++ )
		{
			if (i<=1) continue;
			boolean flag=true;
			for (int j=2;j<i;j++)
			{
				if (i%j==0)flag=false;
			}
			if(flag) System.out.println(i);
		}
	}
}
