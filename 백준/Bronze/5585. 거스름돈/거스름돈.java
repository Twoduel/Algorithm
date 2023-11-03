import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int []arrChange = {500, 100, 50, 10, 5, 1};
		
		int change = 1000-n;
		
		int count = 0;
		
		for(int i=0; i<arrChange.length; i++) {
				
			if(change == 0) {
				break;
			}
				
			if(arrChange[i] <= change) {
				count += change/arrChange[i];
				change = change%arrChange[i];
				}
			else
				continue;
		}
		
		System.out.println(count);
	}
}