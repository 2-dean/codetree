import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int[] binaryArr = new int[binary.length()];
        int num = 0;

        for (int i=0; i<binaryArr.length; i++) {
            binaryArr[i] = binary.charAt(i) - '0';
        }
        // 십진수 변환
        for (int i = 0; i< binaryArr.length; i++) {
            num = num * 2 + binaryArr[i];
        }

        // * 17 
        num *= 17;

        // 2진수 변환
        int[] digits = new int[20];
        int cnt = 0;
        while (true) {
            if (num < 2) {
                digits[cnt++] = num;
                break;
            }
            digits[cnt++] = num % 2;
            num /= 2;
        }

        for (int j = cnt - 1; j >= 0 ; j--) {
            System.out.print(digits[j]);
        }
    }
}