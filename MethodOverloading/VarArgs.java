class VarArgs 
{
	public static void m1(int a)
	{
		System.out.println("m1(int a) is called");
	}
	public static void m1(int...a)
	{
		System.out.println("m1(int...a) is called");
	}
	public static void main(String[] args) 
	{
		m1(10);
		m1(10,20,30);
		m1(10,20,30,40);
	}
}
