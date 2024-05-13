import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean paper[][] = new boolean[100][100];
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			
			for(int j=row; j<row+10; j++) {
				for(int k=col; k<col+10; k++) {
					if(!paper[j][k]) {
						paper[j][k] = true;
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
