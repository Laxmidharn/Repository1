class A1
{
	int i;
	int j;

	public void m1(A1 a)
	{
		a=new A1();
		a.i=10;
		a.j=20;
	}
	public static void main(String[] args) 
	{
		A1 a1= new A1();
		m1(a1);
		System.out.println(a1.i+"\n"+a1.j);
	}
}
