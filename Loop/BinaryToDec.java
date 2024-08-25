import java.util.Scanner;


class BinaryToDec
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a binary number");
		int bin= sc.nextInt();
		int dec=0,i=1;

		while(bin>0)
		{
			dec +=(bin%10)*i;
			i*=2;
			bin/=10;
		}
		System.out.println(dec);
	}
}