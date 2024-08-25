class  Example1
{
	public static void m1(double d)
	{
		System.out.println(d);
	}
	public static int m1(char ch)
	{
		System.out.println(ch);
		return ch;
	}
	public static void main(String[] args) 
	{
		byte b=10;
		int a=b;//Widening

		System.out.println(b+" "+a);

		m1(10);
		m1(10.5);
		m1(8.5f);
		System.out.println(m1('A'));
		m1(5+6.);
	}
}
