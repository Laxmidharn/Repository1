class Swapping 
{
	public static void main(String[] args) 
	{
		int a =20;
		int b =10;
		int c;

		System.out.println("Before Swapping");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println("A= "+a);

		System.out.println("\nSwapping...");
		c=b;
		b=a;
		a=c;

		System.out.println("\nAfter Swapping");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
	}
}
