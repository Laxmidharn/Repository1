import java.util.Scanner;


class ReverseNum1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int temp,nNum=0;
		for (int i=n;i>0;i/=10)
		{
			int digit= i%10;
			nNum= nNum*10+digit;
		}
		System.out.println(nNum);
	}
}
