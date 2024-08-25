import java.util.Scanner;

class  FibonacciInRange
{
	public static void fibonacci(int st,int end)
	{
		int first=0,second=1;

		if (st==0){
			System.out.print(first+" ");
		}
		while (second<=end)
		{
			if (second>=st)
			{
				System.out.println(second+" ");
			}
			
			int next=first+second;
			first=second;
			second=next;
		}

	}
	public static void main(String[] args) 
	{
		System.out.println("Enter range!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		fibonacci(a,b);
	}
}
