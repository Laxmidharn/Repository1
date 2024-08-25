import java.util.Scanner;

class AlternatePrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count=0;
		boolean flag= true;
		for (int i=a;i<=b;i++)
		{
			
			if (i<=1)
			{
				flag=false;
			}
			for (int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag= false;
				}
			}
			if (flag)count++;
			if (count%2!=0)System.out.println(i);
				
		}
		
	}
}
