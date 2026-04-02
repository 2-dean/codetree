import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        // Please write your code here.

        int lx = Math.min(x1, a1);
        int ly = Math.min(y1, b1);

        int rx = Math.max(x2, a2);
        int ry = Math.max(y2, b2);

        int w = rx - lx;
        int h = ry - ly;

        int max = Math.max(w, h);
        System.out.print(max*max);
    }
}