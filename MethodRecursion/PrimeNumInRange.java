import java.util.Scanner;

class  PrimeNumInRange
{
	public static int range(int a, int b)
	{
		if (a>b) return 0;
		if (PrimeNum.isPrime(a,a/2)) System.out.println(a);
		return range(a+1,b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your range");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		range(a,b);
	}
}
