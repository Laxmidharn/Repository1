import java.util.Scanner;

class  CountOfDigits
{
	public static int count(int n)
	{
		if(n==0) return 0;
		return 1+count(n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));
	}
}
