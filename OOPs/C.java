class  C
{
	int i;
	int j;
	public static void m1(C a)
	{
		a = new C();
		a.i=10;
		a.j=20;
	}
	public static void main(String[] args) 
	{
		C a1= new C();
		m1(a1);
		System.out.println(a.i+"\n"+a1.j);
	}
}
