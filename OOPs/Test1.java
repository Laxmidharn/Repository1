
class AAA
{
}
class BB
{
}
class Test1
{
	public BB m1(AAA a)
	{
		System.out.println("M1 is executed with BB return type");
		return new BB();
	}
	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		BB b = t.m1(new AAA());
	}
}
