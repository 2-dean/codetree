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
            int sum = 0;
            int students = 0;
            int[] arr = new int[n];
            
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                p[i] /= 2; // 할쿠
                // 새 배열에 담아보기
                arr[i] = p[i] + s[i];
                Arrays.sort(arr);

                if (sum + arr[i] <= b) {
                    sum += arr[i];
                    students++;
                }               
                p[i] *= 2; //복구
            }
            
            max = Math.max(max, students);
        }
        System.out.print(max);
    }
}