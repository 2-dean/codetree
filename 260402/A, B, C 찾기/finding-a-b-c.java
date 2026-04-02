import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int a = arr[0];
        int b = 0;
        int c = 0;

        for (int i = 1; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[0] + arr[i] + arr[j] == arr[6]){
                    b = arr[i];
                    c = arr[j];
                }
                
            }
        }

        System.out.print(a + " " + b + " " + c);
    }
}