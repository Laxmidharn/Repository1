class AA
{
	int i;
	public static void m1(A a)
	{
		a.i=20;
	}
	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println(a1.i);
		m1(a1);
		System.out.println(a1.i);
	}
}
