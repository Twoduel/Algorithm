import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, n, m);
		
		System.out.println(result);
	}
	
	public static int search(int[] arr, int n, int m) {
		
		int sum = 0;
		int tmp = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int w=j+1; w<n; w++) {
					sum = arr[i] + arr[j] + arr[w];
					
					if(tmp<sum && sum<=m) {
						Math.max(tmp, sum);
						tmp = sum;
					}
				}
			}
		}
		
		return tmp;
	}
}