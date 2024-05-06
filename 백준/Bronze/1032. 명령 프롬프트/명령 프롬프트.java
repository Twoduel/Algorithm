import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String []strArr = new String[n];

        for(int i=0; i<n; i++){
            strArr[i] = br.readLine();
        }

        for(int i=0; i<strArr[0].length(); i++) {
            boolean check = true;

            for (int j = 1; j < n; j++) {
                if (strArr[0].charAt(i) != strArr[j].charAt(i)) {
                    check = false;
                }
            }
            if (check) {
                sb.append(strArr[0].charAt(i));
            } else {
                sb.append("?");
            }
        }

        System.out.println(sb);
    }
}