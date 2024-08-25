class App 
{
	public static void main(String[] args) 
	{
		Book b1= new Book();
		b1.title= "Java";
		b1.author= "James";
		b1.pages= 300;
		b1.count++;

		Book b2= new Book();
		b2.title= "Python";
		b2.author= "van";
		b2.pages= 250;
		b2.count++;

		System.out.println("Number of Books: "+Book.count);
		System.out.println("Title: "+b1.title);
		System.out.println("Pages: "+b1.author);
		System.out.println("Pages: "+b1.pages+"\n");
		
		System.out.println("Title: "+b2.title);
		System.out.println("Pages: "+b2.author);
		System.out.println("Pages: "+b2.pages);
	}
}
class Book
{
	String title, author;
	int pages;
	static int count;
}