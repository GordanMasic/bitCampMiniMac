package ba.bitcamp.vjezbeW8D4;

import java.util.ArrayList;

public class Firm {

	private ArrayList<Employee> developers;

	public Firm() {
		this.developers = new ArrayList<Employee>();
	}

	public String toString() {
		return developers.toString();
	}

	public void hireEmployee(Employee employee) {
		for (int i = 0; i < developers.size(); i++) {
			if (employee.equals(developers.get(i))) {
				System.out.println("That person is already hired!");
			}
		}
		developers.add(employee);
	}

	public void fireEmployee(Employee employee) {
		for (int i = 0; i < developers.size(); i++) {
			if (!employee.equals(developers.get(i))) {
				System.out.println("That person doesn't work here at all!");
			}
		}
		developers.remove(employee);
	}

	public boolean isWorkingHere(Employee employee) {
		for (int i = 0; i < developers.size(); i++) {
			if (employee.equals(developers.get(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFemaleEmployees() {
		for (int i = 0; i < developers.size(); i++) {
			if (developers.get(i).getGender().equals("Female")) {
				return true;
			}
		}
		return false;
	}

	public void sortIDByUsingSelectionSort() {
		for (int i = 0; i < developers.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(developers, i);

			Employee temp = developers.get(i);
			developers.set(i, developers.get(minIndex));
			developers.set(minIndex, temp);
		}
	}

	private int findSmallestElementInRange(ArrayList<Employee> developers2,
			int i) {
		int minIndex = i;
		for (int j = i; j < developers.size(); j++) {
			if (developers.get(j).getiD() < developers.get(minIndex).getiD()) {
				minIndex = j;
			}
		}
		return minIndex;

	}

	public void sortAgeByUsingSelectionSort() {
		for (int i = 0; i < developers.size() - 1; i++) {
			int ageIndex = findLowestAge(developers, i);
			Employee temp = developers.get(i);
			developers.set(i, developers.get(ageIndex));
			developers.set(ageIndex, temp);
		}
	}

	private int findLowestAge(ArrayList<Employee> developers2, int i) {
		int ageIndex = i;
		for (int j = 0; j < developers.size(); j++) {
			if (developers.get(j).getBirth().getYear() >= developers
					.get(ageIndex).getBirth().getYear()) {
				if (developers.get(j).getBirth().getMonth() >= developers
						.get(ageIndex).getBirth().getMonth()) {
					if (developers.get(j).getBirth().getDay() >= developers
							.get(ageIndex).getBirth().getDay()) {
						ageIndex = j;
					}
				}
			}
		}
		return ageIndex;
	}

	public void sortSalaryByUsingInsertionSort() {

		for (int i = 1; i < developers.size(); i++) {
			Employee temp = developers.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (developers.get(j).getSalary() <= temp.getSalary()) {
					break;
				}

				developers.set(j + 1, developers.get(j));
			}

			developers.set(j + 1, temp);
		}
	}

	public void sortGenderByUsingInsertionSort() {

		for (int i = 1; i < developers.size(); i++) {
			Employee temp = developers.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (developers.get(j).getGender().equals("Female")) {
					break;
				}

				developers.set(j + 1, developers.get(j));
			}

			developers.set(j + 1, temp);
		}
	}

	public boolean areSortedByID() {
		for (int i = 0; i < developers.size() - 1; i++) {
			if (developers.get(i).getiD() > developers.get(i + 1).getiD()) {
				return false;
			}
		}

		return true;
	}

	public Employee searchByID(int id) {
		int start = 0;
		int end = developers.size() - 1;
		int middle = (start + end) / 2;

		while (developers.get(middle).getiD() != id) {
			if (start > end) {
				return null;
			}

			if (developers.get(middle).getiD() > id) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle = (start + end) / 2;
		}

		return developers.get(middle);
	}

	public ArrayList<Employee> gettEmployeeList() {
		return developers;
	}

	public void addEmployees(Employee... employees) {
		for (int i = 0; i < employees.length; i++) {
			developers.add(employees[i]);
		}
	}

	public void addEmployeesArray(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			developers.add(employees[i]);
		}
	}

	public void addEmployeesList(ArrayList<Employee> employees) {
		for (int i = 0; i < employees.size(); i++) {
			developers.add(employees.get(i));
		}
	}

	public Integer indexOf(Employee employee) {
		for (int i = 0; i < developers.size(); i++) {
			if (developers.get(i).equals(employee)) {
				return i;
			}
		}
		return null;
	}

	public void removeEmployeeByIndex(int index) {
		try {
			developers.remove(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("There's no such index");
		}
	}

	public void removeEmployeeByID(int id) {
		int counter = 0;
		for (int i = 0; i < developers.size(); i++) {
			if (developers.get(i).getiD() != id) {
				counter++;
			}
		}
		if (counter == developers.size()) {
			System.out.println("There's no such id!");
		} else {
			developers.remove(counter);
		}
	}

	public void sortByName() {
		for (int j = 0; j < developers.size(); j++) {

			for (int i = 0; i < developers.size() - 1; i++) {
				if (developers.get(i).getName()
						.compareTo(developers.get(i + 1).getName()) > 0) {
					Employee temp = developers.get(i);
					developers.set(i, developers.get(i + 1));
					developers.set(i + 1, temp);
				}
			}
		}
	}

	public Employee[] getEmployeeArray() {
		Employee[] array = new Employee[developers.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = developers.get(i);

		}
		return array;
	}

	public ArrayList<String> getNameList() {
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < developers.size(); i++) {
			names.add(developers.get(i).getName());
		}
		return names;
	}
}
