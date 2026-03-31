import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        // A -> B
        int case1 = Math.abs(A-B);
        // y -> x -> B
        int case2 = Math.abs(A - y) + Math.abs(x - B);
        // x -> y -> B
        int case3 = Math.abs(A - x) + Math.abs(y - B);

        int minDist = Math.min(case1, Math.min(case2, case3));
        System.out.print(minDist);
        
    }
}