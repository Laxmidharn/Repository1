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
			int sum=0;

			while (i>0)
			{
				int r=i%10;
				sum+= r*r*r;
				i/=10;
				System.out.println(sum);
			}
			
			//if (sum==i)System.out.println(i);
		}
	}
}
