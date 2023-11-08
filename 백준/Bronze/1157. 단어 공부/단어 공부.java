import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();

        int []arr = new int[26];

        for(int i=0; i<26; i++){
            for(int j=0; j<str.length(); j++){
                if((str.charAt(j) - 65) == i){
                    arr[i]++;
                }
            }
        }

        int max = -1;
        char ch = '?';

        for(int i=0; i<26; i++){
            if(max == arr[i] && max>=1){
                ch = '?';
            }
            else if(max < arr[i]){
                max = arr[i];
                ch = (char)(i+65);
            }
        }
        System.out.println(ch);
    }
}