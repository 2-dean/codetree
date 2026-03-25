import java.util.Scanner;

public class Main {
    static char[] seat;
    static int n;

    public static int getMinDist() {
        int max
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        seat = sc.next().toCharArray();
        
        // Please write your code here.

        int ans = 0;
        for (int i = 0; i < n; i++) { //
            if (seat[i] == '0') {
                // 앉혀보기
                seat[i] == '1';

                ans = Math.max(ans, getMaxDist());
                seat[i] == '0';
            }

        }

        System.out.print();
    }
}