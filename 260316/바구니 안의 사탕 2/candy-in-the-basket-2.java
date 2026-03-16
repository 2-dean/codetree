import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();

            maxPos = Math.max(positions[i], maxPos);
        }

        int[] arr = new int[maxPos+1];
        
        // Please write your code here.
        for (int i = 0; i < n; i++){
            arr[positions[i]] = candies[i];
        }

        int maxVal = Integer.MIN_VALUE;        
        for (int i = k + 1; i <=  maxPos + 1 - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= k * 2 + 1; j++) {
                sum += arr[j];
            }
            maxVal = Math.max(maxVal, sum);
        }

       System.out.print(maxVal); 
    }
}