import java.util.*;

class Shake implements Comparable<Shake> {
    int time;
    int person1;
    int person2;

    public Shake (int time, int person1, int person2) {
        this.time = time;
        this.person1 = person1;
        this.person2 = person2;
    }

    //Arrays.sort() 가 부름
    @Override
    public int compareTo(Shake shake) {
        //시간 기준으로 오름차순
        return time - shake.time;
    }
}

public class Main {
    public static final int MAX_T = 250;
    public static final int MAX_N = 100;

    // 악수 기록
    public static int[] shakeNum = new int[MAX_N + 1];
    public static boolean[] infected = new boolean[MAX_N + 1];

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람수 <= 100
        int K = sc.nextInt(); // 1<= K번동안 감염(지속) <= 250
        int P = sc.nextInt(); // 1<=시작 <=N
        int T = sc.nextInt(); // 1<=T번 반복 <= 250
        infected[P] = true; // 첫 감염자

        Shake[] shakes = new Shake[MAX_T];

        for (int i = 0; i < T; i++) {
            int time = sc.nextInt();
            int person1 = sc.nextInt();
            int person2 = sc.nextInt();
            // Shake 객체생성
            shakes[i] = new Shake(time, person1, person2);
        }

        // Please write your code here.
        // 시간순 정렬
        Arrays.sort(shakes, 0, T);

        // 각 악수 횟수를 세서 K번 초과로 악수했을때 전염시키지 않음!
        for (int i = 0; i < T; i++){ // 악수횟수만큼!!!!!!
            int target1 = shakes[i].person1;
            int target2 = shakes[i].person2;
            
            // 감염 됐을 경우, K번 추가시 새로 옮기지 않음
            
            // 감염되 경우 악수횟수 증가
            if (infected[target1]) {
                shakeNum[target1]++;
            }
            if (infected[target2]) {
                shakeNum[target2]++;
            }

            // target1감염, k번 이하 악수 => target2 전염
            if (shakeNum[target1] <= K && infected[target1]) {
                infected[target2] = true;
            }
            // target2감염, k번 이하 악수 => target1 전염
            if (shakeNum[target2] <= K && infected[target2]) {
                infected[target1] = true;
            }
        }

        for (int i=1; i <= N; i++) {
            if(infected[i])
                System.out.print(1);
            else
                System.out.print(0);
        }
    }
}