package exercises;

public class ForStatement {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n\nCounting divisors");
		int x = 24;
		int count = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				// System.out.println("i = " + i);
				count++;
			}
		}

		System.out.println("\ndivisors count = " + count);

		System.out.println("\n\nDisplaying Student Grades ...");

		int studentGrades[][] = { { 76, 52, 69, 83, 45, 90 }, { 22, 71, 67, 69, 40 }, { 53, 87, 91, 25 } };

		for (int i = 0; i < studentGrades.length; i++) {
			int max = 0;
			System.out.println("\n\nDisplaying Grades of section " + i);
			for (int j = 0; j < studentGrades[i].length; j++) {								
				System.out.print(studentGrades[i][j] + " ");
				if (studentGrades[i][j] > max) {
					max = studentGrades[i][j];
				}
			}
			System.out.println("\nmax = " + max);
		}

	}

}
