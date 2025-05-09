package car.com;

public class Car {
	String model;
	String company;
	double price;
	public void setCarDetailes(String m,String c,double p) {
		 model=m;
		 company=c;
		 price=p;
	}
	public String getCarDetailes() {
		return "model :"+model+"\ncompany :"+company+"\nprice:"+price;
	}
}
