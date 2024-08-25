class Practice4
{
	public static void m1(int i)
	{
		if (i==3)return;
		System.out.println(i);
		m1(i+1);
		System.out.println(i);
		m1(i+1);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		m1(1);
	}
}
