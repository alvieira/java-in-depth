package demo;

public class Student {

	int id;

	String name;

	String gender = "male";
	
	char [] grades;

	Student(int id, String name) {
		this(name);
		this.id = id;
	}
	
	Student(int id, String name, char [] grades) {
		this(name);
		this.id = id;
		this.grades = grades;
	}


	Student(String name) {
		this.name = name;
	}

	boolean updateProfile(String name) {
		this.name = name;
		return true;
	}	

}
