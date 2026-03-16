import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();

            maxPos = Math.max(positions[i], maxPos);
        }

        int[] arr = new int[maxPos+1];
        
        // Please write your code here.
        for (int i = 0; i < n; i++){
            arr[positions[i]] = candies[i];
        }

        int maxVal = 0;     
        // 중심점 i 를 0~ 부터 max 까지 다확인
        for (int i = 0;i <= maxPos; i++) {
            int sum = 0;

            // 중심점(i) 기준 왼쪽 끝 i-k , 오른쪽끝 
            int start = Math.max(0, i - k);
            int end = Math.min(maxPos, i + k);
            for (int j = start; j <= end; j++) {
                sum += arr[j];
            }
            maxVal = Math.max(maxVal, sum);
        }

       System.out.print(maxVal); 
    }
}