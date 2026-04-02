import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        int a = arr[0];
        int b = 0;
        int c = 0;
        int d = 0;

            
        for (int i = 1; i < 14; i++) { // b
            for (int j = i + 1; j < 14; j++) { //c
                for (int k = j + 1; k < 14; k++) { //d
                    if (arr[0] + arr[i] + arr[j] + arr[k] == arr[14]){
                        if (arr[j] <= arr[0] + arr[i]){
                            b = arr[i];
                            c = arr[j];
                            d = arr[k];
                        }
                    } 
                }
            }
        }

        System.out.print(a + " " + b + " " + c + " " + d);
    }
}