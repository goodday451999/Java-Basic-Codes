package sampleCode;

class Student{
	int id;
	String name;
	static int count = 0;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		count++;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public static int getCount() {
		return count;
	}
//	public static void setCount(int count) {
//		Student.count = count;
//	}
	
}
public class StaticDemo {
	public static void main(String args[]) {
		Student anil = new Student(1, "Anil");
		System.out.println(anil.getCount());
		Student sunil = new Student(2, "Sunil");
		System.out.println(sunil.getCount());
		
		System.out.println(Student.getCount());
	}
}
