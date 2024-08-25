import java.util.Scanner;


class  LargestPrime
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter two numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int count=0;
		for (int i=b;i>=a;i--)
		{
			if (i<=1) continue;
			boolean flag=true;
			for (int j=2;j<i;j++)
			{
				if (i%j==0)flag=false;
			}

			if(flag){
				count++;
				if (count==2)
				{
					System.out.println(i);
				break;
				}
				
			}
		}
	}
}
