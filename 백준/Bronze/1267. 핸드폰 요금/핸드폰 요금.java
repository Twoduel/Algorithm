import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int last_charge = 0;
        int y = 0;
        int m = 0;
        int y_sum = 0;
        int m_sum = 0;

        for(int i=0; i<n; i++){
            last_charge = Integer.parseInt(st.nextToken());

            // 영식이 요금 계산
            y = (last_charge/30+1)*10;
            // 민식이 요금 계산
            m = (last_charge/60+1)*15;

            y_sum += y;
            m_sum += m;
        }

        if(y_sum < m_sum){
            System.out.println("Y " + y_sum);
        }
        else if(m_sum < y_sum){
            System.out.println("M " + m_sum);
        }
        else {
            System.out.println("Y M " + y_sum);
        }
    }
}