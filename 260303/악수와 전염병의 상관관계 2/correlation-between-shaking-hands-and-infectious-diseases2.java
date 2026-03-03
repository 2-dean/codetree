import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람수
        int K = sc.nextInt(); // K번동안 감염(지속)
        int P = sc.nextInt(); // 시작
        int T = sc.nextInt(); // T번 반복
        int[][] shakes = new int[T][3];

        int[] person = new int[N+1];
        int[] remain = new int[N+1]; // 남은 전염 가능 횟수
        remain[P] = K;
        person[P] = 1;
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); //t 초에
            shakes[i][1] = sc.nextInt(); //x 
            shakes[i][2] = sc.nextInt(); //y
        }
        // Please write your code here.
        // 시간순 정렬
        Arrays.sort(shakes, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < shakes.length; i++){
            int x = shakes[i][1];
            int y = shakes[i][2];
            // x가 감염자이고 전염 가능하면
            if (remain[x] > 0 && remain[y] == 0) {
                remain[x]--;
                remain[y] = K;
                person[y] = 1;
            }
            // y가 감염자이고 전염 가능하면
            if (remain[y] > 0 && remain[x] == 0) {
                remain[y]--;
                remain[x] = K;
                person[x] = 1;
            }
            // 둘다 감염자인경우
            
        }

        for (int i=1; i < person.length; i++) {
            System.out.print(person[i]);
        }
    }
}