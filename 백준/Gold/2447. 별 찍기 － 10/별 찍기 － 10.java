import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	static String [][]arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new String[n][n];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(arr[i], " ");
		}
		
		merge_sort(0, 0, n);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void merge_sort(int x, int y, int n) {
		if(n == 1) {
			arr[x][y] = "*";
			return;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(!(i==1 && j==1)) {
					merge_sort(x+i*(n/3), y+j*(n/3), n/3);
				}
			}
		}
	}
}