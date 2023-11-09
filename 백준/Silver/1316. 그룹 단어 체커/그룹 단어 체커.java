import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(check(str) == true){
                count++;
            }
        }

        System.out.println(count);
    }

    static boolean check(String str){
        boolean []check = new boolean[26];
        int prev = 0;

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);

            if(prev != now) {

                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                else return false;
            }
        }
        return true;
    }
}