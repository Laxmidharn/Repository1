import java.util.Scanner;


class Unknown1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number");
		int n= sc.nextInt();
		int bin=0,i=1;
		while(n>0)
		{
			int bit=n%2;
			bin=bit*i +bin;
			i*=10;
			n/=2;
		}
		System.out.println(bin);
	}
}