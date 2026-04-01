import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int count =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        //버블정렬
        for (int i = 0; i < n ; i++ ) {
            for (int j = 0; j < n -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
   //     for (int d : arr) {
//        System.out.print(d + " ");
  //      }
        System.out.print(count);
    }
}