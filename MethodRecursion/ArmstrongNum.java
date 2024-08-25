import java.util.Scanner;


class ArmstrongNum
{
	public static int isArmstrong(int n, int c)
	{
		if(n==0)return 0;
		return (int)Math.pow(n%10,c)+isArmstrong(n/10,c);
	}
	public static boolean isArmstrong1(int n, int c)
	{
		if(n==0)return false;
		int a = (int)Math.pow(n%10,c)+(isArmstrong1(n/10,c));
		if (a==n)return true;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = CountOfDigits.count(n);
		if(n==isArmstrong(n,c))System.out.println(n+" is a armstrong number");
		else System.out.println(n+" is not a armstrong number");

		if(isArmstrong1(n,c))System.out.println(n+" is a armstrong number");
		else System.out.println(n+" is not a armstrong number");
	}
}
