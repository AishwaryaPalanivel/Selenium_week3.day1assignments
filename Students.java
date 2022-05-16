package week3.day1.assignment1;

public class Students {

	public void getStudentInfo(Long id) {
		System.out.println("Student ID is "+id);
	}
	
	public void getStudentInfo(Long id, String name) {
		System.out.println("Student ID is "+id+" Name is "+ name);
	}
	
	public void getStudentInfo(int contactNo , String email) {
		System.out.println("Student Contact No is "+contactNo+ " Email Id is "+email);
	}
	
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo(123456l);
		students.getStudentInfo(123456l, "Aishwarya");
		students.getStudentInfo(1234567810, "aishwarya@gmail.com");
	}
}
