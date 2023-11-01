import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashSet;

/*public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        int count = 0;
        int s = 0;
        int e = arr.length-1;
        while(s<e) {
        	if(arr[s] + arr[e] == x) {
        		count++;
        		s++;
        		e--;
        	}
        	else if(arr[s]+arr[e] > x)
        		e--;
        	else
        		s++;
        }
        
        System.out.print(count);
    }
}*/

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        
        HashSet<Integer> set = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	set.add(arr[i]);
        }
        
        int x = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i=0; i<n; i++) {
        	if(set.contains(x-arr[i])) {
        		count++;
        	}
        }
        
        System.out.println(count/2);
    }
}
