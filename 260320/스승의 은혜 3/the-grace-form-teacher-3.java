import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt(); // 예산
        int[] p = new int[n];
        int[] s = new int[n];


        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt(); // 선물
            s[i] = sc.nextInt(); // 배송비
        }
        int max = 0;
      
        // Please write your code here.
        for (int i = 0; i < n; i++) {
           
            int[] arr = new int[n];
            
            for (int j = 0; j < n; j++) {
                if (i == j) { // 한명씩 할쿠적용
                    arr[j] = (p[j] / 2) + s[j]; // 할쿠
                } else {
                    arr[j] = p[j] + s[j];
                }
            }   
            Arrays.sort(arr);
            int sum = 0;
            int students = 0;
            
            for (int k = 0; k < n; k++) {
                if (sum + arr[k] <= b) {
                    sum += arr[k];
                    students++;
                }               
            }
            
            max = Math.max(max, students);
        }
        System.out.print(max);
    }
}