class ForEach 
{
	public static void m1(int... a)
	{
		for (int n:a)
		{
			System.out.println(n+" "+a);
		}
	}
	public static void main(String[] args) 
	{
		m1(20,30,40);
	}
}
