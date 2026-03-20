import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt(); // 예산
        int[] p = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt(); // 선물
            s[i] = sc.nextInt(); // 배송비
        }
        int max = 0;
        // Please write your code here.
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int students = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                p[i] /= 2; // 할쿠
                if (b > sum && sum <= b) {
                    sum += p[i];
                    sum += s[i];
                    students++;
                }               
                p[i] *= 2;
            }
            max = Math.max(max, students);
        }
        System.out.print(max);
    }
}