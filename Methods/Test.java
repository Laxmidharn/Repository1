class Test 
{
	public void m1()
	{
		System.out.println("Non-static m1()");
	}
	public static void m2(int i,int j)
	{
		System.out.println("Static m2() with "+i+" "+j);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
		Test.m2(10,20);
		Test.m2(20-10,5);
		Test.m1();
	}
}
