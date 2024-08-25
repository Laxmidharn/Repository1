import java.util.Scanner;

class  ArmstronginRange1
{
	public static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			n/=10;
			c++;
		}
		return c;

	}
	public static boolean isArmstrong(int n, int c)
	{
		int sum=0,temp=n;
		while(n>0)
		{
			int digit = n%10;
			sum +=(int)Math.pow(digit,c);
			n/=10;
		}
		if(sum==temp)return true;
		else return false;
		
	}
	public static void range(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			int c = count(i),cou=0;
			if(isArmstrong(i,c))
			{
				cou++;
				alternate(i,cou);
			}//System.out.println(i);
		}
	}
	public static void alternate(int i, int cou)
	{
		if(cou%2!=0)System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		range(a,b);
	}
}
