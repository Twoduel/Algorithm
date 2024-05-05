import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int cookTime = Integer.parseInt(br.readLine());

        // 1분은 60초이기 때문에 cookTime/60해서 합산
        // cookTime에서 분을 뺀 나머지를 초에 합산
        minute += cookTime/60;
        second += cookTime%60;

        // second의 범위가 60이기 때문에 60이 아래로 정리. second는 second/60으로 minute에 넘겨줌
        minute += second/60;
        second %= 60;

        // minute의 범위가 60이기 때문에 60 아래로 정리
        hour += minute/60;
        minute %= 60;

        //hour의 범위는 24이므로 24아래로 정리
        hour %= 24;

        System.out.println(hour + " " + minute + " " + second);
    }
}