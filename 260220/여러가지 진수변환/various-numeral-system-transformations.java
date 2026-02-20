import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] digits = new int[10000];
        int count = 0;
        while (true) {
            if (n < b) {
                digits[count++] = n;
                break;
            }
            digits[count++] = n % b;
            n /= b;
        }

        for (int i = count -1; i >=0 ; i--) {
            System.out.print(digits[i]);
        }
    }
}