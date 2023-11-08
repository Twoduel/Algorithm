import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Integer.parseInt(br.readLine());
        long b = Integer.parseInt(br.readLine());
        long c = Integer.parseInt(br.readLine());

        long multy = a*b*c;

        String str = Long.toString(multy);
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            int count = 0;

            for (int j=0; j<str.length(); j++){
                if((str.charAt(j)-'0') == i)
                    count++;
            }
            System.out.println(count);
        }
    }
}