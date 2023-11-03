import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int []a = new int[n];
		int []b = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			count += a[i]*b[n-i-1];
		}
		
		System.out.println(count);
	}
}