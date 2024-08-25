class A11
{
	int i;
	int j;

	public void m1(A11 a)
	{
		a=new A11();
		a.i=10;
		a.j=20;
	}
	public static void main(String[] args) 
	{
		A11 a1= new A11();
		m1(a1);
		System.out.println(a1.i+"\n"+a1.j);
	}
}
