import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++){
            int n = Integer.parseInt(br.readLine());
            BigInteger s = new BigInteger("0");

            for(int j=0; j<n; j++){
                BigInteger n2 = new BigInteger(br.readLine());
                s = s.add(n2);
            }
            if(s.compareTo(BigInteger.ZERO) == -1) { System.out.println("-"); }
            else if(s.compareTo(BigInteger.ZERO) == 1) { System.out.println("+"); }
            else { System.out.println("0"); }
        }
    }
}