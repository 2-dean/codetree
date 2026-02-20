import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int from = a * 60 + b;
        int to = c * 60 + d;

        int result = to - from;
        System.out.print(result);
    }
}