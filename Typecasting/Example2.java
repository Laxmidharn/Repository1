class  Example2
{
	public static void m1(int i, double d)
	{
		System.out.println(i+" "+d);
	}
	public static void m1(double d, int i)
	{
		System.out.println(d+" "+i);
	}
	public static void main(String[] args) 
	{
		m1(10,10.5);
		m1(10.5,10);
		//m1(10,10);
		
		m1(5,6.);
	}
}
