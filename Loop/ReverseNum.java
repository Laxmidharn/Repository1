import java.util.Scanner;


class ReverseNum
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int temp,nNum=0;
		while (n>0)
		{
			int digit= n%10;
			nNum= nNum*10+digit;
			n/=10;
		}
		System.out.println(nNum);
	}
}
