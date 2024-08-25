import java.util.Scanner;

class  PrimeAll
{
	public static boolean isPrime(int n)
	{
		if(n<1)return false;
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)return false;
		}
		return true;
	}
	public static void range(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isPrime(i))System.out.println(i);
		}

	}
	public static void largesAndSmallest(int st, int end)
	{
		for (int i=st;i<=end;i++)
		{
			if (isPrime(i))
			{
				System.out.println("Smallest Prime number between "+st+" and "+end+" is "+i);
				break;
			}
		}
		for (int i=end;i>=st;i--)
		{
			if (isPrime(i))
			{
				System.out.println("Largest Prime number between "+st+" and "+end+" is "+i);
				break;
			}
		}
	}
	public static void alternatePrimeNum(int st, int end)
	{
		int count=0;
		for (int i=st;i<=end;i++)
		{
			if (isPrime(i))
			{
				count++;
				if(count%2!=0)System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times to use");
		int cont =sc.nextInt();
		while(cont>0)
		{
		System.out.println("To check a number is Prime or not PRESS:1\n");
		System.out.println("To check Prime numbers in a range PRESS:2\n");
		System.out.println("To check Largest and Smallest Prime numbers in a range PRESS:3\n");
		System.out.println("To check Alternate Prime numbers in a range PRESS:4 ");
		System.out.println("Enter your task number");
		int choice=sc.nextInt();
		
		switch(choice)
			{
				case 1:
					System.out.println("Enter your number");
					int n = sc.nextInt();
					if (isPrime(n))System.out.println(n+" is a prime number");
					else System.out.println(n+" is not a prime number");
				break;

				case 2:
					System.out.println("Enter your range");
					int a = sc.nextInt();
					int b = sc.nextInt();
					System.out.println("______________________________________________");
					range(a,b);
				break;

				case 3:
					System.out.println("Enter your range");
					int c = sc.nextInt();
					int d = sc.nextInt();
					System.out.println("______________________________________________");
					largesAndSmallest(c,d);
				break;

				case 4:
					System.out.println("Enter your range");
					int e = sc.nextInt();
					int f = sc.nextInt();
					System.out.println("______________________________________________");
					alternatePrimeNum(e,f);
				break;
			}
			cont--;
		}
	}
}
