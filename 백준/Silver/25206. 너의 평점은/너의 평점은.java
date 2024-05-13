import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double sum = 0.0;
		double count = 0.0;
		
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			double score = 0.0;
			
			if(!grade.equals("P")) {
				count += credit;
				switch(grade) {
				case "A+" : sum += (credit*4.5); break;
				case "A0" : sum += (credit*4.0); break;
				case "B+" : sum += (credit*3.5); break;
				case "B0" : sum += (credit*3.0); break;
				case "C+" : sum += (credit*2.5); break;
				case "C0" : sum += (credit*2.0); break;
				case "D+" : sum += (credit*1.5); break;
				case "D0" : sum += (credit*1.0); break;
				case "F" : sum += (credit*0.0); break;
				default : break;
				}
			}
		}
		
		String ans = String.format("%.6f", sum/count);
		System.out.printf(ans);
	}
}
