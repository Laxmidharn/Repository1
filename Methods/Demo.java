class Demo 
{
	public static void m1()
	{
		System.out.println("m1 is executed");
	}
	public static int m2()
	{
		System.out.println("m2 is executed");
		return 5;
	}
	public static double m3(double d)
	{
		System.out.println("m3 is executed");
		return d;
	}
	public static void main(String[] args) 
	{
		m1();
		int n=m2();
		System.out.println(m3(7.3));
	}
}
