class Emp 
{
	String name;
	int age, id;
	public void add(String n,int a, int i)
	{
		name=n;
		age=a;
		id=i;
	}
	public void display()
	{
		System.out.println(name+"\n"+age+"\n"+id);
	}
	public static void main(String[] args) 
	{
		Emp e= new Emp();
		e.add("Laxmi",12,5);
		e.display();
	}
}