class  Snake
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				int x= i*n-(n-1);
				for (int j=1;j<=n;j++)
				{
					System.out.print(x+"\t");
					x++;
				}
				System.out.println();
			}
			else
			{
				int y=i*n;
				for (int j=1;j<=n;j++)
				{
					System.out.print(y+"\t");
					y--;
				}
				System.out.println();
			}
		}
	}
}
