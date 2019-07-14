package demo;

public class BasicsDemo {

	public static void main(String[] args) {
		arrays();

	}

	private static void arrays() {
		System.out.println("\nInside arrays...");
		int [] myArray = new int[] {9,11,2,5,4,4,6};
		System.out.println("myArray.lenght: " + myArray.length);
		System.out.println("myArray[1]: " + myArray[1]);
	}

}
