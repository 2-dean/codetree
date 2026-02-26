import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        // 시간의 흐름에 따라 a, b가 어디있는지 => 배열의 인덱스가 시간임!!!
        int[] timeA = new int [1000001];
        int[] timeB = new int [1000001]; // 1000 * 1000
        
        // a. b의 현재위치
        int curA = 1;
        // a 의 이동
        for (int i = 0; i < n ; i ++ ){
            char d = sc.next().charAt(0); // 방향
            int t = sc.nextInt(); // 이동시간

            while (t-- > 0) {
                if (d == 'R') { // 우측으로 이동
                    timeA[curA] = timeA[curA - 1] + 1;
                } else {
                    timeA[curA] = timeA[curA - 1] - 1; // 왼쪽이동
                }
                curA++;
            }
        }
        //b 의 이동
        int curB = 1;
        for (int i = 0; i < n ; i ++ ){
            char d = sc.next().charAt(0); // 방향
            int t = sc.nextInt(); // 이동시간
            while (t-- > 0) {
                if (d == 'R') { // 우측으로 이동
                    timeB[curB] = timeB[curB - 1] + 1;
                } else {
                    timeB[curB] = timeB[curB - 1] - 1; // 왼쪽이동
                }
                curB++;
            }
        }
        int result = -1;
        for (int i = 1 ; i < c; i++) {
            if (timeA[i] == timeB[i]){
                result = i;
                return;
            }
        }
        System.out.print(result);
        
    }
}