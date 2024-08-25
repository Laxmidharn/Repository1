import java.util.Scanner;

class Student
{
	String name;
	int age;
	int id;
	public void display()
	{
		System.out.println(name+"\n"+age+"\n"+id);
	}
	public Student createStudent()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student name");
		name=s.nextLine();
		System.out.println("Enter Student age");
		age=s.nextInt();
		System.out.println("Enter Student id");
		id=s.nextInt();
		return this;
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.createStudent();
		s.display();
	}
}
