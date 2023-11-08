import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
   
   static int[][] campus;
   static boolean[][] check;
   
   static int[] dirX = {-1, 1, 0, 0};
   static int[] dirY = {0, 0, -1, 1};
   
   static int count = 0, n, m;
   
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());
      
      campus = new int[n][m];
      check = new boolean[n][m];
      
      int x=0, y=0;
      
      for(int i=0; i<n; i++) {
         String input = br.readLine();
         
         for(int j=0; j<m; j++) {
            campus[i][j] = input.charAt(j);
            
            if(campus[i][j] == 'I') {
               x = i;
               y = j;
            }
         }
      }
      
      dfs(x, y);
      
      if(count == 0) {
         System.out.println("TT");
      }
      else
         System.out.println(count);
   }
   
   static void dfs(int x, int y) {
      check[x][y] = true;
      
      if(campus[x][y] == 'P') count++;
      
      for(int i=0; i<4; i++) {
         int dx = x + dirX[i];
         int dy = y + dirY[i];
         
         if(dx>=0 && dy>=0 && dx<n && dy<m && !check[dx][dy]) {
            if(campus[dx][dy] != 'X') {
               dfs(dx, dy);
            }
         }
      }
   }
}