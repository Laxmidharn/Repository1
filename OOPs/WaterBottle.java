class WaterBottle 
{
	String name,color,type;
	int size;
	int level=0;
	boolean flag=false;

	public void display()
	{
		if(level==0)
		{
			flag=false;
			System.out.println("Water level is :"+level+" please refill...");
		}
		if(flag)
		{
			System.out.println("Water level is :"+level);
			System.out.println("Bottle size is :"+size+" Refill water: "+(size-level)+" units");
			System.out.println("Bottle color is :"+color);
			System.out.println("Bottle type is :"+type);

		}
		else
		{
			System.out.println("Refill water to drink");
		}
	}
	public void drinkWater()
	{
		if(flag)
		{
			System.out.println("Drinking water...");
			level--;
		}
		else
		{
			System.out.println("Refill water to drink");
		}
		System.out.println("Water level is :"+level);
		System.out.println("Bottle size is :"+size+" Refill water: "+(size-level)+" units");
	}
	public void fillWater()
	{
		System.out.println("Water Refilling...");
		level++;
		flag=true;
		System.out.println("Water level is :"+level+" You can fill more..."+(size-level)+" units");

		if(level==size)
		{
			System.out.println("Bottle is full now ... Go to drink water");
			System.out.println();
			System.out.println("\nThank You!");
			
		}
	}
}
