class Demo1
{
	public static int add(int i, int j)
	{
		return i+j;
	}
	public static void main(String[] args) 
	{
		add(5,5);
		System.out.println(add(20,10));
		int res=add(20,0);
		System.out.println(res);
	}
}
