import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[101];
        for (int i = 0 ; i < n ; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1 ; j <= x2; j++) {
                arr[j]++;
            }
        }


        for (int x : arr) {
            if (x > 1) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}