package book.com;

public class BookMain {
	public static void main(String args[]) {
		Book b=new Book();
		b.setBookDetailes("Java Basics", "John Doe",450.0 );
		String res=b.getBookDetailes();
		System.out.println(res);
	}
}
