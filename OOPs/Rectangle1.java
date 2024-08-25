class Rectangle1
{
	int length;
	int breadth;
	void initialization(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	}
	public int area()
	{
		int res=length*breadth;
		//System.out.println(res);
		return res;
	}
	public int perimeter()
	{
		int res=2*(length+breadth);
		//System.out.println(res);
		return res;
	}
	public void display()
	{
		System.out.println(length+"\n"+breadth);
		System.out.println(area());
		System.out.println(perimeter());
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.display();
		r.initialization(10,20);
	}
}
