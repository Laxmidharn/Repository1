class Student 
{
	String name;
	int age;
	int id;
	Student(String n, int a, int i)
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
		Student s = new Student("laxmi",24,5);
		s.display();
	}
}
