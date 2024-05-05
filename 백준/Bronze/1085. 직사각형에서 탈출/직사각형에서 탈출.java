import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int w_min = 0;
        int h_min = 0;

        if(w/2 < x){
            w_min = w-x;
        }
        else {
            w_min = x;
        }

        if(h/2 < y){
            h_min = h-y;
        }
        else{
            h_min = y;
        }

        if(h_min < w_min){
            System.out.println(h_min);
        }
        else {
            System.out.println(w_min);
        }
    }
}