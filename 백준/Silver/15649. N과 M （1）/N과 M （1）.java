import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static boolean check[];
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		check = new boolean[n];
		
		dfs(n, m, 0);
		
		System.out.println(sb);
    }
	
	private static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int i=0; i<m; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[depth] = i+1;
				dfs(n, m, depth+1);
				check[i] = false;
			}
		}
	}
}