import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int []arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int s = 0;
		int e = n-1;
		int count = 0;
		
		while(s<e) {
			if(arr[s]+arr[e] > m) {
				e--;
			}
			else if(arr[s]+arr[e] < m) {
				s++;
			}
			else {
				count++;
				s++;
				e--;
			}
		}
		
		System.out.print(count);
	}
}
