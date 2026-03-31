import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 거리
        // Please write your code here.


        //최단 시간 구하기 시간 = 거리 / 속력
        int time = 0;
        int dist = 0;
        int v = 1;
    
        while (dist < x) {
            time++;
            dist += v; // 1초동안 현재속도만큼 이동

            int nextV = v + 1;
            // 가속가능한지
            if (dist + (nextV * (nextV + 1) / 2) <= x) {
                v = nextV;
            }
            // 유지 가능한지
            else if (dist + (v * (v+1)/ 2) <= x) {
                // v 유지
            }
            // 감속
            else{
                v--;
            }
            if (v < 1) v = 1;
        }
        System.out.print(time);
    }
}