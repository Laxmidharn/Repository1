import java.util.Scanner;

class  AlternateArmstrongNum
{
	public static boolean isPalindrome(int n)
	{
		int temp=n;
		int m=n;
		int sum=0,count=0;

		while (m>0)
		{
			count++;
			m/=10;
		}
		while (n>0)
		{
			int digit=n%10;
			int prod=1;
			for (int j=1;j<=count;j++)
			{
				prod*=digit;
			}
			sum+=prod;
			n/=10;
		}
		if (sum==temp)return true;
		else return false;
	}
	public static void range(int st, int end)
	{
		int count =0;
		for (int i=st;i<=end;i++)
		{
			if (isPalindrome(i))
			{
				count++;
				if (count%2!=0)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		range(a,b);
	}
}
