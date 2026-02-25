import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntArr = new int[1001];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 
        int max = 0;
        int cnt = 1 ; // 현재 연속길이
        for (int i = 0; i < n; i++) {
            if (i > 1 &&arr[i] == arr[i-1]) {
                cnt ++;
            } else {   // 다른 묶음으로 넘어갔으면?
                cnt = 1; // 초기화
            }
            max = Math.max(max, cnt);
        }
        // Please write your code here.
        System.out.print(max);
    }
}
