class Mobile 
{
	String name,color;
	int ram, rom;
	public void add(String name, String color, int ram, int rom)
	{
		this.name=name;
		this.color=color;
		this.ram= ram;
		this.rom=rom;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(ram);
		System.out.println(rom);
	}
	public static void main(String[] args) 
	{
		Mobile m1= new Mobile();
		m1.add("Vivo","Black",4,128);
		m1.display();
		Mobile m2= new Mobile();
		m2.add("Realme","Blue",6,128);
		m2.display();
	}
}
