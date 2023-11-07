import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
	
	static int node;
	static int line;
	static int count;
	
	static int [][]arr;
	static boolean [] check;
	
	static Queue<Integer> q = new LinkedList<>();
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		for(int i=1; i<=line; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(1);
		
		System.out.println(count);
	}
	
	public static int dfs(int start) {
		check[start] = true;
		
		for(int i=1; i<=node; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				count++;
				dfs(i);
			}
		}
		return count;
	}
}