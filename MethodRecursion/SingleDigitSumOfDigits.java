import java.util.Scanner;


class SingleDigitSumOfDigits
{
	public static int sum(int n)
	{
		if(n==0) return 0;
		int a=n%10 + sum(n/10);
		if (a>9) return sum(a);
		return a;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
	}
}
