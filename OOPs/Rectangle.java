class Rectangle
{
	int length;
	int breadth;
	void initialization(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	}
	public void area()
	{
		int res=length*breadth;
		System.out.println(res);
	}
	public void perimeter()
	{
		int res=2*(length+breadth);
		System.out.println(res);
	}
	public void display()
	{
		System.out.println(length+"\n"+breadth);
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.display();
		r.initialization(10,20);
		r.area();
		r.perimeter();
		r.display();
	}
}
