import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        boolean overlap = false;
        for (int i = 0; i < n; i++) {
            int maxX = -1;
            int minX = 101;
            for (int j = 0; j < n ; j++) {
                if (i == j) continue;// 건너뛰기 하나씩
                else {
                    maxX = Math.max(maxX, x1[j]);
                    minX = Math.min(minX, x2[j]);
                }
            }
            if (minX >= maxX) {
                overlap = true;
                break;
            }
        }
        if (overlap) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

        
    }
}