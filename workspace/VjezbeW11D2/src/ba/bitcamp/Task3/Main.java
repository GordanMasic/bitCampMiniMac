package ba.bitcamp.Task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(
					"File.txt")));
			while (br.ready()) {
				String line = br.readLine();
				String[] ip = line.split(" ");
				map.put(ip[0], ip[1]);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			InetAddress ip = client.getInetAddress();
			String address = ip.getHostAddress();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String sentence = reader.readLine();

			System.out.println(map.get(address) + ": " + sentence);

			Scanner input = new Scanner(System.in);
			sentence += " " + input.nextLine();
			
			Socket zaidSocket = new Socket("10.0.82.98", 8888);
			BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(
					zaidSocket.getOutputStream()));
			writer1.write(sentence);
			writer1.newLine();
			writer1.close();
			while (true) {
				try {
					String ipSend = getRandomIP(map);
					String sendName = map.get(ipSend);
					System.out.println(sendName);
					Socket randomSocket = new Socket(ipSend, 8888);
					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(
									randomSocket.getOutputStream()));
					writer.write(sentence);
					writer.newLine();
					writer.close();
					break;
				} catch (IOException e) {
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getRandomIP(HashMap<String, String> map) {
		HashMap<String, String> names = map;
		names.remove("Gordan");
		Set<String> set = names.keySet();
		String[] array = new String[names.size()];
		set.toArray(array);
		return array[(int) (Math.random() * array.length)];

	}
}
