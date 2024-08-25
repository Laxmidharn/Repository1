class A 
{
	int i=20;
	public void m1()
	{
		int i=10;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m1();
	}
}