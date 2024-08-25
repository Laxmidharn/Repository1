class E 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		E.m1();
		System.out.println("Main Ends");
	}
	public static void m1()
	{
		System.out.println("M1 Starts");
		E.m2();
		System.out.println("M1 Ends");
	}
	public static void m2()
	{
		System.out.println("M2 Starts");
		G.m3();
		System.out.println("M2 Ends");
	}
}
