import java.util.*;

Class Shake implements Comparable<Shake>) {
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

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람수 <= 100
        int K = sc.nextInt(); // 1<= K번동안 감염(지속) <= 250
        int P = sc.nextInt(); // 1<=시작 <=N
        int T = sc.nextInt(); // 1<=T번 반복 <= 250



        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt(); // 1<= t초 <=250
            shakes[i][1] = sc.nextInt(); //x 
            shakes[i][2] = sc.nextInt(); //y
        }
        // Please write your code here.
        // 시간순 정렬
        Arrays.sort(shakes, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < shakes.length; i++){
            int x = shakes[i][1];
            int y = shakes[i][2];
            boolean xCan = remain[x] > 0;
            boolean yCan = remain[y] > 0;

            // x가 감염자였다면
            if (xCan) {
                if (remain[y] == 0) {
                    remain[y] = K;
                    person[y] = 1;
                }
                remain[x]--;
            }

            // y가 감염자였다면
            if (yCan) {
                if (remain[x] == 0) {
                    remain[x] = K;
                    person[x] = 1;
                }
                remain[y]--;
            }

            
        }

        for (int i=1; i < person.length; i++) {
            System.out.print(person[i]);
        }
    }
}