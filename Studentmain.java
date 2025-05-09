package student.com;

public class Studentmain {
		public static void main(String args[]) {
			Student student=new Student();
			student.setStudentDetailes("ABC",101,85.5);
			String result=student.getStudentDetailes();
			System.out.println(result);
		}
	}


