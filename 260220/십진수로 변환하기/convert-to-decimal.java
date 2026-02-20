import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int[] arr = new int [binary.length()];
        int num =0;
        for (int i = 0; i< arr.length; i++){
            arr[i] = binary.charAt(i) - '0';
        }
        for (int j = 0 ; j < arr.length; j++) {
            num = num * 2 + arr[j];
        }
        System.out.print(num);
    }
}