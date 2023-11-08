import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int [] n = new int[10];

        int max = 0;

        for(int i=0; i<str.length(); i++){
            int number = str.charAt(i) - '0';

            if(number == 9){
                number = 6;
            }

            n[number]++;
        }

        n[6] = (n[6]/2) + (n[6]%2);

        Arrays.sort(n);

        System.out.println(n[9]);
    }
}