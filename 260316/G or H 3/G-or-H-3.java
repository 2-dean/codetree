import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[10001];
        
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            arr[pos] = (c == 'G' ? 1 : 2);
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= arr.length - 1 - k; i++) {
            int sum = 0;
            for(int j = i; j <= i+k; j++){
                sum += arr[j];
            }
            maxValue = Math.max(maxValue, sum);
        }
        System.out.print(maxValue);
    }
}