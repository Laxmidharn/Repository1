class  Unknown
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n= 5;
		int st=1,sp=n-1,st1=1,sp1=n-1;
		char ch='A';
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if (i<n/2)
			{
				sp--;
				st+=2;
			}
			else {
				sp++;
				st-=2;
			}
		}
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=sp1;j++)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=st1;k++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			if (i<n/2)
			{
				sp1--;
				st1+=2;
			}
			else {
				sp++;
				st-=2;
			}
		}
	}
}
