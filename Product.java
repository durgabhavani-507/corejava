package product.com;

public class Product {
	String productName; 
	int productId;
	double price;
	public void setProductDetailes(String name,int id,double prc) {
		productName=name; 
		productId=id;
		price=prc;
	}
	public String getProductDetailes() {
		return "product name: "+productName+"\n product Id: "+productId+"\n product price: "+price;
	}
}