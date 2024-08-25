import java.util.Scanner;


class Test 
{
	public static int strong(int n)
	{
		if(n==0)return 0;
		int a=Factorial.fact(n%10);
		return a+strong(n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==strong(n))System.out.println(n+" is a Strong number");
		else System.out.println(n+" is not a Strong number");
	}
}
