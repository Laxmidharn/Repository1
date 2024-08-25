class Practice6 
{
	public static int m1(int i)
	{
		if (i==3) return 30;
		System.out.println(i);
		return m1(i+1);
	}
	public static void main(String[] args) 
	{
		System.out.println(m1(1));
	}
}
