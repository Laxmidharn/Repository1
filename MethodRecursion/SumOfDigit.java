import java.util.Scanner;


class SumOfDigit 
{
	public static int sum(int n)
	{
		if(n==0) return 0;
		return n%10+sum(n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
	}
}
