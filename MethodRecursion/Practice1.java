class Practice1 
{
	public static void m1(int a)
	{
		if (a==11)return;
		System.out.println(a);
		m1(a+1);
	}
	public static void main(String[] args) 
	{
		m1(1);
	}
}
