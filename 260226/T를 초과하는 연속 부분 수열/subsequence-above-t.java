import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > t) {
                if (i==0 || arr[i] > arr[i-1]) {
                    count++;
                } else {
                    count = 1;
                }
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        } 
        System.out.print(max);
    }
} 