import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int k;
	static int count = 0;
	static int result = -1;
	static int[] temp;
	static int[] arr;
	
	private static void merge_sort(int[] arr, int p, int r) {
		if(p < r) {
			int q = (p+r)/2;
			merge_sort(arr, p, q); //반으로 나눠서 전반부 정렬
			merge_sort(arr, q+1, r); //반으로 나눠서 후반부 정렬
			merge(arr, p, q, r);	
		}
	}
	
	private static void merge(int[] arr, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		
		while(i<=q && j<=r) {
			if(arr[i] <= arr[j]) {
				temp[t++] = arr[i++];
			}
			else {
				temp[t++] = arr[j++];
			}
		}
		
		
		// 왼쪽 배열 부분이 남은 경우
		while(i <= q) {
			temp[t++] = arr[i++];
		}
		// 오른쪽 베열 부분이 남은 경우
		while(j <= r) {
			temp[t++] = arr[j++];
		}
		
		i = p;
		t = 0;
		// temp에 정렬했던 결과를 arr에 저장
		while(i <= r) {
			count++;
			if(count == k) {
				result = temp[t];
				break;
			}
			
			arr[i++] = temp[t++];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		temp = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(arr, 0, arr.length-1);
		
		System.out.println(result);
	}
}
