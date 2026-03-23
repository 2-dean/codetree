import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        // Please write your code here.
        char[] arr = new char[n];

        for (int i = 0 ; i < n; i++) {
            arr[i] = s.charAt(i); 
        }


        int len = 1;
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n ; j++ ){
                if (arr[i] == arr[j]) {
                    len++;
                }       
            }
        }
        System.out.println(len);

    }
}