import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	static int count;
	static StringBuilder sb = new StringBuilder();
	static int from=1, tmp=2, to=3;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi_tower(n, from, tmp, to);
		
		System.out.println(count);
		System.out.println(sb);
	}
	
    private static void hanoi_tower(int n, int from, int tmp, int to) {
    	count++;
    	// 가장 큰 원판(n=1) 옮기기
    	if(n == 1) {
    		sb.append(from).append(" ").append(to).append("\n");
    		return;
    	}
    	
    	// 가장 큰 원판을 제외한 나머지 원판 옮기기(n-1)
    	else {
    		//n-1개를 A에서 B로 이동
    		hanoi_tower(n-1, from, to, tmp);
    		
    		sb.append(from).append(" ").append(to).append("\n");
    		// n-1개를 B에서 C로 이동
    		hanoi_tower(n-1, tmp, from, to);
    	}
    }
}