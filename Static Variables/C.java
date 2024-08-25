class C 
{
	static int i = 1;

	public static void main(String[] args) 
	{
		System.out.println(C.i);

		C.i = 2;
		System.out.println(C.i);
		C.i = 3;
		System.out.println(C.i);
	}
}
