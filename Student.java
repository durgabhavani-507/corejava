package student.com;

public class Student {
String name;
int rollNumber;
double percentage;
public void setStudentDetailes(String nm,int roll,double perc) {
	 name=nm;
	rollNumber=roll;
	 percentage=perc;
}
public String getStudentDetailes() {
	return "student name:"+name+"\nroll number:"+rollNumber+"\npercentage:"+percentage;
}
}	