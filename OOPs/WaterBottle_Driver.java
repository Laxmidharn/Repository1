import java.util.Scanner;

class WaterBottle_Driver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Enter what you want...");
		System.out.println("To see water bottle features PRESS:1\n To Drink Water PRESS:2\n To fill water PRESS:3");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		int n;

		WaterBottle w = new WaterBottle();
		w.name="Bottle";
		w.color="White";
		w.type="Copper";
		w.size=5;

		do
		{
			System.out.println("\n\nEnter 0 to exit");
			n = sc.nextInt();

			switch(n)
				{
				case 1:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					w.display();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
				case 2:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					w.drinkWater();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
				case 3:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					w.fillWater();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
				default:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					if(n!=0)
					System.out.println("Enter a valid task...");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
		}while(n!=0);
	}
}
