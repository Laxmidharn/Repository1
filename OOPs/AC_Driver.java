class AC_Driver 
{
	public static void main(String[] args) 
	{
		AC a1= new AC();
		a1.on();
		a1.display();
		System.out.println("=================================");
		a1.increaseTemp();
		a1.display();
		System.out.println("=================================");
		a1.decreaseTemp();
		a1.display();
		System.out.println("=================================");
	}
}