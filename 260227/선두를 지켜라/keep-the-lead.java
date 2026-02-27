import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 선두 기록
        char[] record = new char[1000001];
        // 시간별 위치기록
        int[] posA = new int[100001];
        int[] posB = new int[100001];     

        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // v = 속도
            A[i][1] = sc.nextInt(); // t = 시간 
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        //선두가 몇번이 바뀌는지 찾아 출력하는 프로그램을 작성해보세요.
        // Please write your code here.
        int timeA = 1;
        for(int i = 0; i < A.length; i++) {
            int v = A[i][0]; // 속도
            int t = A[i][1]; //시간
        
            for (int j = 0; j < t; j++) { // 초당 v, 현재에 이전거를 누적해줘야함
                posA[timeA] = posA[timeA - 1] + v; // 누적
                timeA++;
            }
        }
        int timeB = 1;
        for(int i = 0; i < B.length; i++) {
            int v = B[i][0]; // 속도
            int t = B[i][1]; //시간
        
            for (int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }

        // 선두 기록
        for (int i = 1; i < 100001; i ++) {
            if(posA[i] > posB[i]) {
                record[i] = 'A';
            } else if (posA[i] < posB[i]) {
                record[i] = 'B';
            } else {
                record[i] = record[i-1]; // 공동선두면 유지
            }
        }

        // 선두가 몇번 바뀌는지 
        // A → B 로 바뀔 때만 +1, B → A 로 바뀔 때만 +1체크
        int count = 0;
        // 0초는 값없음, 1초부터 비교를 위해서 2부터 시작
        for (int i = 2; i < 100001; i++){
            if(record [i] != record[i-1]) {
                count++;
            }
        } 
        System.out.print(count);
    } 
}