import java.util.Scanner;


class  Fibonanci
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter range");
		int a= sc.nextInt();
		int first=0, second=1;
		for (int i=1;i<=a;i++)
		{
			System.out.print(first+" ");
			int next = first + second;
			first=second;
			second=next;
		}
	}
}
