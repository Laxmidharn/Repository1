import java.util.Scanner;


class  Automorphic
{
	public static boolean isAutomorphic(int sq, int n)
	{
		if (n==0) return true;
		if(sq%10==n%10)return isAutomorphic(sq/10,n/10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sq = n*n;

		if (isAutomorphic(sq,n))System.out.println(n+" is a automorphic number");
		else System.out.println(n+" is not a automorphic number");
	}
}
