import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for (int v = 2; v <= 100; v += 2) { // 세로
            for (int h = 2; h <= 100; h+= 2) { //가로선
                // 구역
                int q1 = 0, q2 = 0, q3 = 0, q4 = 0; 

                for (int i = 0; i < n ; i++ ) {
                    if (x[i] < v && y[i] > h) q1++; // 왼쪽위
                    else if (x[i] > v && y[i] > h) q2++; // 오른쪽위
                    else if (x[i] < v && y[i] < h) q3++; // 왼쪽 아래
                    else q4++;
                }
                int M = Math.max(Math.max(q1,q2) , Math.max(q3,q4)) ;

                ans = Math.min(ans, M);
            }
        }
        System.out.print(ans);
    }
}