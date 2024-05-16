import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine()) != null) {
			int n = Integer.parseInt(str);
			
			sb = new StringBuilder();
			
			int k = (int)Math.pow(3, n);
			
			for(int j=0; j<k; j++) {
				sb.append("-");
			}
			merge_sort(0, k);
			
			System.out.println(sb);
		}
	}
	
	private static void merge_sort(int start, int size) {
		if(size == 1) {
			return;
		}
		
		int len = size/3;
		for(int i=start+len; i<start+2*len; i++) {
			sb.setCharAt(i, ' ');
		}
		
		merge_sort(start, len);
		merge_sort(start+2*len, len);
		
	}
}