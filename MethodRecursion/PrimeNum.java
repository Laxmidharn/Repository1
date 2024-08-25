import java.util.Scanner;


class PrimeNum
{
	public static boolean isPrime(int n, int i)
	{
		if(n<=1)return false;
		if (i<=1) return true;
		if(n%i==0) return false;
		return isPrime(n,i-1);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isPrime(n,n/2))System.out.println(n+" is a Prime number");
		else System.out.println(n+" is not a Prime number");
	}
}
