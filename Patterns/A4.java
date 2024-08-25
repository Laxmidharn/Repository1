import java.util.Scanner;

class A4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int a = sc.nextInt();
		int b =1;
		for (int i=1;i<=a ;i++ ){
			if (i%2 !=0)
			{
				int x = ((i-1)*a)+1;
				for (int j=1;j<=a;j++){
					System.out.print(x+"\t");
					x++;
				}
				System.out.println();
			}else{
				int x = (i*a);
				for (int j=1;j<=a;j++)
				{
					System.out.print(x+"\t");
					x--;
				}
				System.out.println();
			}
		}
	}
}