import java.util.Scanner;

class Student 
{
	String name;
	int age,id;
	public void add()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name");
		name=s.nextLine();
		System.out.println("Enter age");
		age=s.nextInt();
		System.out.println("Enter id");
		id=s.nextInt();
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
	public static void main(String[] args) 
	{
		Student s1= new Student();
		s1.add();
		s1.display();
		Student s2= new Student();
		s2.add();
		s2.display();
	}
}
