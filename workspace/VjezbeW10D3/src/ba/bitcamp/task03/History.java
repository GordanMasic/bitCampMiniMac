package ba.bitcamp.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class History {

	public static void main(String[] args) {
		BufferedReader in = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			in = new BufferedReader(new FileReader(new File(
					"/Users/gordan.masic/Desktop/history.txt")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}

		try {
			while (in.ready()) {
				String line = in.readLine();

				StringTokenizer st = new StringTokenizer(line, " ");
				if (line.isEmpty()) {
					in.readLine();
				} else {
					while (st.hasMoreTokens()) {
						String year = st.nextToken();
						// System.out.println(year);
						if (year.equals("in")) {
							year = st.nextToken();
							try{
							Integer number = Integer.parseInt(year);
								list.add(number);
								System.out.println(list.size());
							}catch(NumberFormatException e){}
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
