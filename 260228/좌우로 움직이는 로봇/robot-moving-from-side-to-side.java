import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //시간별 위치
        int[] posA = new int [1000001]; 
        int[] posB = new int [1000001]; 
        
        //시작
        int curA = 1, curB = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    posA[curA] = posA[curA - 1] + 1;
                } else {
                    posA[curA] = posA[curA - 1] - 1;
                }
                curA++;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    posB[curB] = posB[curB - 1] + 1;
                } else {
                    posB[curB] = posB[curB - 1] - 1;
                }
                curB++;
            }
        }
        
        // Please write your code here.
        int count = 0;
        int maxCur = Math.max(curA, curB);
        // 움직임 종료 후 위치 유지 

        for (int i = curA;  i< maxCur ; i++) {
            posA[i] = posA[i-1]; 
        }
        for (int i = curB;  i< maxCur ; i++) {
            posB[i] = posB[i-1]; 
        }
        
        for (int i = 2 ; i < maxCur; i ++) {
             // 직전엔 다른위치였을경우
            if (posA[i-1] != posB[i-1] &&  posA[i] == posB[i] )  {
                count ++;
            }
        }

        System.out.print(count);
    }
}