import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int count = 1;
        int sum = 0;
        int j = 1;

        while(count <= end){
            for(int i=1; i<=j; i++){
                sb.append(j + " ");
                count++;
            }
            j++;
        }

        String str = sb.toString();
        st = new StringTokenizer(str);

        for(int i=1; i<start; i++){
            st.nextToken();
        }
        for(int i=start; i<=end; i++){
            sum += Integer.parseInt(st.nextToken());
        }

        System.out.println(sum);
    }
}