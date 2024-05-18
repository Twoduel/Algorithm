import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int dp[];
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		int ans = 0;
		
		for(int i=3; i<dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(tile(n));
	}
	
	private static int tile(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		
		if(dp[n] == -1) {
			dp[n] = (tile(n-2) + tile(n-1)) % 15746;
		}
		
		return dp[n];
	}
}