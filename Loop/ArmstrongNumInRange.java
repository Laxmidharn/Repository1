import java.util.Scanner;


class  ArmstrongNumInRange
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i=a;i<=b;i++)
		{
			int sum=0,prod=1;

			while (i>0)
			{
				int r =i%10;
				sum+= r*r*r;
				i/=10;
			}
			if (sum==i)System.out.println(i);
		}
	}
}
