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
		
		double[] arr = new double[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += (arr[i]/arr[arr.length-1])*100;
		}
		
		System.out.println(sum/n);
	}
}