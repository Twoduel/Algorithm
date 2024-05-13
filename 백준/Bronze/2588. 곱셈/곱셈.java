import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		for(int i=0; i<b.length(); i++) {
			System.out.println(a * (b.charAt(b.length()-1-i) - '0'));
		}
		
		System.out.println(a * Integer.parseInt(b));
		
	}
}
