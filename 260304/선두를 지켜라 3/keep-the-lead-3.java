import java.util.Scanner;
public class Main {
    static int MAX_T = 1000001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];

        int[] aRecord = new int[MAX_T];
        int[] bRecord = new int[MAX_T];

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt(); //속도
            int t = sc.nextInt(); //시간
            for (int j = 1; j <= t; j++) {
                aRecord[timeA] = aRecord[timeA-1] + v; // 누적
                timeA++;
            } 
        }
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt(); //속도
            int t = sc.nextInt(); //시간
            for (int j = 1; j <= t; j++) {
                bRecord[timeB] = bRecord[timeB-1] + v; // 누적
                timeB++;
            } 
        }

        int maxTime = Math.max(timeA, timeB);
        char[] rank = new char[maxTime+1];

        // Please write your code here.
        for (int i = 1; i <= maxTime; i++) {
            if (aRecord[i] > bRecord[i]) {
                rank[i] = 'A';
            } else if(aRecord[i] < bRecord[i]) {
                rank[i] = 'B'; 
            } else {
                rank[i] = 'E';
            }
            //System.out.print(rank[i]);
        }
        int count = 0;
        for (int i = 2; i <= maxTime; i++) {
            if (rank[i] != rank[i-1]) count++;
        }
        
        System.out.print(count);
    }
}