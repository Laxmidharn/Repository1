class Circle 
{
	int rad;
	public void display()
	{
		System.out.println(rad);
	}
	public static void main(String[] args) 
	{
		Circle c1= new Circle();
		c1.rad=10;
		Circle c2= c1;
		c2.rad=20;
		c1.display();
		c2.display();
	}
}
