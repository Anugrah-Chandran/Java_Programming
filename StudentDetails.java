package j_lab;
class Student{
	String studentName;
	static int studentCount=0;
	Student(String studentName){
		this.studentName = studentName;
		studentCount++;
	}
	public static void getStudentCount() {
		
		System.out.println("Student Count:"+studentCount);
	}
}
public class StudentDetails {
	public static void main(String []args) {
		Student std1 = new Student("Anugrah");
		Student std2 = new Student("Alwin");
		Student std3 = new Student("Bichu");
		Student.getStudentCount();
		
		
	}

}
