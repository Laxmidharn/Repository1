class B 
{
	static int i;

	public static void main(String[] args) 
	{
		B b1= new B();
		b1.i= 10;

		B b2= new B();
		b2.i= 20;

		System.out.println(b1.i);
		System.out.println(b2.i);
	}
}
