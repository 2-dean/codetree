import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // 최대로 차이나는 값 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            // i + k 이내인거 찾기
            for (int j = i + 1; j < n ; j++){
                if (arr[i] <= arr[j] && arr[j] <= arr[i] + k) {
                    //System.out.println("arr j = " + arr[j]);
                    count++;
                }
            }
            maxCnt = Math.max(maxCnt, count); 
            //System.out.println("-------------");

        }
        System.out.print(maxCnt);
    }
}