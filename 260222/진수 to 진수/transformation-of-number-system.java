import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        // A진수로 표현된 어떤수 N을 B진수로 변환 하여 출력
        // a -> 10 -> b
       
        // 1. a->10

        int[] baseArr = new int[20];
        int num = 0;
        
        for (int i =0; i < N.length(); i++) {
            baseArr[i] = N.charAt(i)- '0';
        }

        for (int i = 0; i< N.length(); i++) {
            num = num * A + baseArr[i];
        }

        // 10 -> b
        int[] digits = new int [20];
        int cnt = 0;

        while (true) {
            if (num < B) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % B;
            num /= B;
        }

        for (int i = cnt-1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}