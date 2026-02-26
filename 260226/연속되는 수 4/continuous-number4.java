import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
   
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (i == 0 || arr[i] > arr[i-1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
         }
        // Please write your code here.
        System.out.print(max);
    }
}