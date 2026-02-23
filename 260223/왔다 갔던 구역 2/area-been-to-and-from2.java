import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int [2000];
        int N = sc.nextInt();
        int cur = 1000; // 시작위치
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if (dir == 'L') { // 왼쪽으로 이동 현재-거리  부터 현재위치까지
                for (int j = cur - 1; j >= cur - x; j--) {
                    line[j]++;
                } 
                cur -= x; // 현재위치 갱신
            } else { // 오른쪽 이동 : > 현재 ~ 거리까지
                for (int k = cur; k < cur + x; k++) {
                    line[k]++;
                } 
                cur += x; // 현재위치 갱신
            }
        }
        int count = 0;
        for (int box :line) {
            //System.out.println (box);
            if (box >= 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}