import java.util.Scanner;
public class Main {
    static int[] a = new int[100];
    static int[] b = new int[100];
    static int n;
    static int m;
    public static int countNum(int first, int second) {
        int cnt = 0;

        for (int i = 0; i < m; i++){
            // 쌍이 a,b 또는 b, a 면 갯수를 셈
            if (first == a[i] && second == b[i]) {
                cnt++;
            } else if (first == b[i] && second == a[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();


        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt(); 
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ans = Math.max(ans,  countNum(i, j));
            }
        }
        System.out.print(ans);
    }
}