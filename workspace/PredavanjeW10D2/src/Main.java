import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.util.Scanner;
import java.io.*;

public class Main {

	private static void printByteArray(byte[] array) {
		for (byte b : array) {
			System.out.print(b);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// InputStream is = null;
		//
		// is =System.in;// new FileInputStream("nesto.txt");
		//
		// OutputStream os = null;
		// try {
		// os = new FileOutputStream("nesto.txt",true);
		// } catch (FileNotFoundException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		//
		// Reader r = new InputStreamReader(System.in);
		// Writer w = new OutputStreamWriter(System.out);
		//
		// BufferedReader br = new BufferedReader(r);
		// BufferedWriter bw = new BufferedWriter(w);
		//
		//
		//
		// byte[] buffer = new byte[3];
		// try {
		// int read = 0;
		// do {
		// read = is.read(buffer);
		// // System.out.println("Procitao: " + read);
		// os.write(buffer,0,read);
		// // printByteArray(buffer);
		// } while (is.available() > 0);
		// String s = "\nHello World\n";
		// for (int i = 0; i < s.length(); i++) {
		// os.write(s.charAt(i));
		// }
		// byte[] array = s.getBytes();
		// os.write(array);
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//
		// System.out.println("Gotovo");
		// }

//		InputStream is = null;
//		try {
//			is = new FileInputStream("nesto.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		Reader r = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(r);
//		
//		PrintWriter pw = new PrintWriter(System.out);
//		try {
//			String s = br.readLine();
//			while (s != null){
//				pw.println(s);
//				s = br.readLine();
//
//			} 
//			pw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		pw.close();
		
		User u = new User("John", 26);
		InputStream is;
		OutputStream os;
		try {
			os = new FileOutputStream("user.dat",true);
			is = new FileInputStream("user.dat");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(u);
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User)ois.readObject();
			
			System.out.println(fromFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
