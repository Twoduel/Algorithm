import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = br.readLine();
        String[] croatiaAlphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0; i<croatiaAlphabet.length; i++){
            if(alphabet.contains(croatiaAlphabet[i])){
                alphabet = alphabet.replace(croatiaAlphabet[i],"a");
            }
        }

        System.out.println(alphabet.length());
    }
}