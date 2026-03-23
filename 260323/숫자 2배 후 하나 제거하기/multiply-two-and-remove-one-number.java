import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDiff = 100;
        // 두배할 숫자 고르기
        for (int i = 0; i < n; i++) {
            arr[i] *= 2;
            
            //하나 제거할 거 고르기
            for (int j = 0; j < n; j ++) {
                int[] remainingArr = new int[n-1];
                int cnt = 0;
                //n-1개 담앗
                for (int k = 0; k < n; k++) {
                    if (k != j) 
                        remainingArr[cnt++] = arr[k];
                }

                int sumDiff = 0;
                for (int k = 0; k < n - 2; k++) {
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
                }

                minDiff = Math.min(minDiff, sumDiff);

            }
            arr[i] /= 2;
        }
        System.out.print(minDiff);

    }
}