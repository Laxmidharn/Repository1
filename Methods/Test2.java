class Test2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts!");
		for (int i=1;i<=10;i++)
		{
			if(i==5)return;
			System.out.println(i);
		}
		System.out.println("Main ends!");
	}
}
