import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }

        // Please write your code here.
        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++){
                    if (i == j || j == k || k == i ) 
                        continue;
                    //해당 숫자가 정답일때, 모든 입력에 대해 올바른 답이 나왔는지 확인
                    boolean succeeded = true;
                    for (int q = 0; q < n; q++) {
                        // x : num[q] 의 백의 자릿수 y : 십 ; z: 일
                        int x = num[q] / 100;
                        int y = num[q] / 10 % 10;
                        int z = num[q] % 10;
                            // 자릿수 , 있음
                        int cnt1 = 0, cnt2 = 0;
                        if (x == i) 
                            cnt1++;
                        if (y == j)
                            cnt1++;
                        if (z == k ) 
                            cnt1++;
                        if (x == j || x == k) 
                            cnt2++;
                        if (y == i || y == k)
                            cnt2++;
                        if (z == i || z == j)
                            cnt2++;

                        // 타운트 수가 다르면 정답 X;
                        if (cnt1 != count1[q] || cnt2 != count2[q]) {
                            succeeded = false;
                            break;                        
                        }
                    }
                    if (succeeded) cnt++;
                }

            }

        }
        System.out.print(cnt);
    }
}