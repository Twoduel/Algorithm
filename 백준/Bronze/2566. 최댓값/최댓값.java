import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int max = 0;
		int row = 1;
		int col = 1;
		
		for(int i=1; i<=9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=9; j++) {
				int n = Integer.parseInt(st.nextToken());
				
				if(n > max) {
					max = n;
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
	}
}
