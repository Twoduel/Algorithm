import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;
	
	private static int recursion(String str, int l, int r) {
		count ++;
		if(l >= r) return 1;
		else if(str.charAt(l) != str.charAt(r)) return 0;
		else return recursion(str, l+1, r-1);
	}
	
	private static int ispalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			
			sb.append(ispalindrome(str)).append(" ").append(count).append("\n");
			
			count = 0;
		}
		
		System.out.println(sb);
	}
}
