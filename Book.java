package book.com;

public class Book {
	String title;
	String author;
	double price;
	public void setBookDetailes(String t,String a, double p) {
		title=t;
		 author=a;
		 price=p;
	}
	public String getBookDetailes() {
		return "title:"+title+"author:"+author+"price:"+price; 
	}
}
