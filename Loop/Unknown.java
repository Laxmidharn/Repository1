import java.util.Scanner;


class Unknown
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		String s="";
		while(n>0)
		{
			int bit=n%2;
			n/=2;
			s=bit+s;
		}
		System.out.println(s);
	}
}