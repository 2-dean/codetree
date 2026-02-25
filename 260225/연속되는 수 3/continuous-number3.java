import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;
        int cur = 0 ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0 || arr[i] < 0 != arr[i-1] < 0) {  // 음수양수 다를때 
                cur = 1;
            } else {
                cur++;
            }
           

            max = Math.max(max, cur);
        }
        // Please write your code here.
        System.out.print(max);
    }
}