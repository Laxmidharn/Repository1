class  AA
{
	int i;
	public void display()
	{
		System.out.println(i);
	}
}
class Test
{
	public static AA m1()
	{
		return new AA();
	}

	public static void main(String[] args) 
	{
		AA a1= m1();
		a1.i=30;
		a1.display();
		//System.out.println("Hello World!");
	}
}
