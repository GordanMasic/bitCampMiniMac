import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class URLTest {

	public static void main(String[] args) {
		try {
			URL dlURL = new URL("http://devlogic.eu");
			URLConnection conn = dlURL.openConnection();
			InputStream in = conn.getInputStream();
			String res = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line = br.readLine()) != null){
				res += line + "\n";
			}
			
			System.out.println(res);
		} catch (MalformedURLException e) {
			System.out.println("URL not OK!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
