class C 
{
	public static void m1() 
	{
		System.out.println("M1 inn Class C");
	}

	public static void m2() 
	{
		System.out.println("M2 inn Class C");
	}

	public static void main(String[] args) 
	{
		C.m1();

		C c1 = new C();
		c1.m2();
	}
}
