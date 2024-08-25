class D
{
	static int j = 1;

	public static void main(String[] args) 
	{
		D.m1();
		D.j = 2;
		D.m1();

	}
	public static void m1()
	{
		System.out.println("M1 Starts");
		System.out.println("D.j");
		System.out.println("M1 Ends");
	}
}
