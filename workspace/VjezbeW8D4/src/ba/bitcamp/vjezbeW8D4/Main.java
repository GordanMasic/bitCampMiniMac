package ba.bitcamp.vjezbeW8D4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Gordan", "Masic", "Male", 1500.00,
				10, 6, 1991);

		// System.out.println(employee1.toString());

		System.out.println(employee1.getiD());

		Employee employee2 = new Employee("Kristina", "Pupavac", "Female",
				1500.00, 22, 6, 1987);

		// System.out.println(employee2.getiD());

		Employee employee3 = new Employee("Ajla", "El Tarabi", "Female",
				1500.00, 5, 7, 1984);

		Employee employee4 = new Employee("Senadin", "Botic", "Male", 1500.00,
				27, 3, 1988);
		Employee employee5 = new Employee("Zaid", "Zerdo", "Male", 3000.00, 01,
				01, 1994);
		Employee employee6 = new Employee("Narena", "Ibrisimovic", "Female",
				1500.00, 02, 01, 1985);
		Employee employee7 = new Employee("Zeljko", "Miljevic", "Male",
				1500.00, 03, 01, 1988);

		Firm javatars = new Firm();
		javatars.addEmployees(employee5, employee6, employee7, employee2,
				employee1, employee3, employee4);
		javatars.sortGenderByUsingInsertionSort();

		javatars.sortIDByUsingSelectionSort();
		System.out.println(javatars.toString());
		System.out.println(javatars.searchByID(1004));

		for (Employee employee : javatars.gettEmployeeList()) {
			System.out.println(employee.toString());

		}
		javatars.sortByName();
		System.out.println(javatars.toString());
		
		Employee[] array = javatars.getEmployeeArray();
		
		System.out.println(Arrays.toString(array));
	}
}
