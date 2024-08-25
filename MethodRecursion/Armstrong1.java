import java.util.Scanner;

class  Armstrong1
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
	public static int isArmstrong(int n, int c)
	{
		int sum=0;
		while(n>0)
		{
			int digit = n%10;
			sum +=(int)Math.pow(digit,c);
			n/=10;
		}
		return sum;

	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = count(n);

		if(isArmstrong(n,c)==n)System.out.println(n+" is a armstrong number");
		else System.out.println(n+" is not a armstrong number");
	}
}
