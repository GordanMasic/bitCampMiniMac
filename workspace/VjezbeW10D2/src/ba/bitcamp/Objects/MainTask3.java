package ba.bitcamp.Objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainTask3 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("John", 2600);
		Employee employee2 = new Employee("Joe", 1500);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		InputStream is;
		OutputStream os;
		try {
			os = new FileOutputStream("employees.dat", true);
			is = new FileInputStream("employees.dat");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(list);
			osw.flush();
			ObjectInputStream ois = new ObjectInputStream(is);
			ArrayList<Employee> fromFile = (ArrayList<Employee>) ois
					.readObject();

			System.out.println(fromFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
