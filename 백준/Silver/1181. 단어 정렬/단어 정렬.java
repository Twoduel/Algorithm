import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String o1, String o2) {

				//사전 순 정렬
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				//길이가 짧은 것 부터 -> 올림차순
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for(int i=1; i<n; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}
}