import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int end = str.length()-1;
		boolean check = true;
	
		if(str.length()%2 == 0) {
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(end--)) {
					check = false;
					break;
				}
			}
		}
		else {
			for(int i=0; i<str.length()/2-1; i++) {
				if(str.charAt(i) != str.charAt(end--)) {
					check = false;
					break;
				}
			}
		}
		if(check) {
			System.out.println(1);
		}
		else
			System.out.println(0);
	}
}
