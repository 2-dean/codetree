import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N번
        int[] a = new int[n]; 
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        
        int result = 0;
        // 돌 들어간 컵
        for(int i = 1; i <= 3; i ++) {
            int now = i;
            int count = 0;
    
            //a <-> b n번 교체
            for (int j = 0; j < n; j++) {
                if (now == a[j]) {
                    now = b[j]; 
                } else if (now == b[j]) {
                    now = a[j];
                }

                // c 열어서 있으면 점수
                if (now == c[j]) count++;
            }
            result = Math.max (count, result);
        }
        System.out.print(result);
    }
}