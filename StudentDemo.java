package java_lab;
class Student{
	String name;
	int rollNum;
	int mark1,mark2,mark3;
	float avg;
	Student (String name,int rollNum,int mark1,int mark2,int mark3){
		this.name = name;
		this.rollNum = rollNum;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public void calculateAvg() {
		avg = (mark1+mark2+mark3)/3;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNum);
		System.out.println("Mark 1:"+mark1+"\nMark 2:"+mark2+"\nMark 3:"+mark3);
		System.out.println("Average:"+avg);
	}
}
public class StudentDemo {
	public static void main(String [] args) {
		Student student = new Student("Alwin",18,98,99,97);
		student.calculateAvg();
		student.display();
		Student student2 = new Student("Bichu",31,60,70,88);
		student2.calculateAvg();
		student2.display();
	}
}
