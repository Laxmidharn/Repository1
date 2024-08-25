import java.util.Scanner;


class  Automorphic
{
	public static int range(int st, int end)
	{
		if(st>=end)return 0;
		if(isAutomorphic(st*st,st))return st;
		return range(st+1,end);
	}
	public static boolean isAutomorphic(int sq, int n)
	{
		if (n==0) return true;
		if(sq%10==n%10)return isAutomorphic(sq/10,n/10);
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your range");
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int end = sc.nextInt();
		//int n = sc.nextInt();
		//int sq = n*n;

		//if (isAutomorphic(sq,n))System.out.println(n+" is a automorphic number");
		//else System.out.println(n+" is not a automorphic number");

		System.out.println(range(st,end));
	}
}
