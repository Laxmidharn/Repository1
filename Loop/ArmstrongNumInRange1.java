import java.util.Scanner;


class  ArmstrongNumInRange1
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i=a;i<=b;i++)
		{
			int n=i;
			int sum=0;

			while (n>0)
			{
				int r=n%10;
				sum+= (r*r*r);
				n/=10;
			}
			if(sum==i)System.out.println(i);
		}
	}
}
