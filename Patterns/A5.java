import java.util.Scanner;

class A5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter limit");

		int a = sc.nextInt();
		int b =1;int x = 0;
		for (int i=1;i<=a;i++)
		{
			
			if(i%2!=0){
				
				int y=(i*x)+1;
				for (int j=1;j<=i;j++)
				{
					System.out.print(y+"\t");
					y++;
				}
				x++;
				System.out.println();
			}else{
				int y=(i*(i+1))/2;
				for (int j=1;j<=i;j++)
				{
					System.out.print(y+"\t");
					y--;
				}
				System.out.println();
			}
		}
	}
}