package demo;

public class StudentTest {

	public static void main(String[] args) {
		
		int studentIds[] = new int[] { 1001, 1002, 1003, 1004 };

		Student student1 = new Student(studentIds[0], "Joan");
		student1.gender = "male";

		Student student2 = new Student(studentIds[1], "Joe");
		student2.gender = "male";

		Student student3 = new Student(studentIds[2], "Mary");
		student3.gender = "female";
		
		Student student4 = new Student(studentIds[3], "Sebastian", new char[] {'A', 'B'});		
		
		System.out.println("Name of student 1: " + student1.name);
		System.out.println("Name of student 2: " + student2.name);
		System.out.println("Name of student 3: " + student3.name);
		System.out.println("Name of student 4: " + student4.name);
		
		student1.updateProfile("John");
		System.out.println("Updated name of student 1: " + student1.name);
		
		Student student5 = student1;
		System.out.println("Name of student 5: " + student5.name);
		
		student5.updateProfile("Mike");
		System.out.println("Name of student 1: " + student1.name);
		System.out.println("Name of student 5: " + student5.name);
		
		student5 = student2;
		System.out.println("Name of student 5: " + student5.name);
		System.out.println("Name of student 2: " + student2.name);
		
		student2 = student1;
		System.out.println("Name of student 5: " + student5.name);
		System.out.println("Name of student 2: " + student2.name);
		
		student5 = new Student("Alex");
		System.out.println("Name of student 5: " + student5.name);
		System.out.println("Name of student 2: " + student2.name);
		System.out.println("Name of student 1: " + student1.name);
		
	}

}
