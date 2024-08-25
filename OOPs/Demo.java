class A
{
}
class B
{
}
class Demo 
{
	public static void m1(A a)
	{
		System.out.println("M1 is executed");
	}
	public void m2(B b)
	{
		System.out.println("M2 is executed");
	}
	public static void main(String[] args) 
	{
		A a= new A();
		B b= new B();

		Demo.m1(a);

		Demo d = new Demo();
		d.m2(b);
		
	}
}
