import java.util.Scanner;

class ArmstrongNum
{
	public static int isArmstrongfor(int n,int c)
	{
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum+=(int)Math.pow(digit,c);
			n/=10;
		}return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = count(n);
		if (isArmstrongfor(n,c)==n)System.out.println(n+" is a Armstrong number");
		else System.out.println(n+" is not a Armstrong number");
	}
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
}
