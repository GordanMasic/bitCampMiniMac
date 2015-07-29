package ba.bitcamp.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader in = null;
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			in = new BufferedReader(new FileReader(new File(
					"/Users/gordan.masic/Desktop/example.csv")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}

		try {
			in.readLine();
			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				String name = st.nextToken();
				String surname = st.nextToken();
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();

				list.add(new Employee(name, surname, gender.charAt(0),
						position, Integer.parseInt(salary)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(list);
		System.out.println(list);

	}
}
