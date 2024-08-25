class Practice5
{
	public static void m1(int i)
	{
		System.out.println(i);
		if (i==3)return;
		System.out.println(i);
		m1(i+1);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		m1(1);
	}
}
