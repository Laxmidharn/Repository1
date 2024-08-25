class A 
{
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.println("Main Starts");
		A.m1();
		System.out.println(i);
		System.out.println("Main ends");
	}
	public static void m1()
	{
		int i = 2;
		System.out.println("M1 Starts");
		System.out.println(i);
		System.out.println("M1 Ends");
	}
}
