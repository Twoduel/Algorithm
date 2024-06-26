import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int sum = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(fibo(n));
	}
	
	private static int fibo(int n) {
		if(n == 0) {return 0;}
		if(n == 1) {return 1;}
		
		return fibo(n-1) + fibo(n-2);
	}
}
