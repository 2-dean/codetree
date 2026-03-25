import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n];
        int[] nums = new int[101];
        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        // Please write your code here.



        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k; j++ ) {
                if (j >= n) break; // 배열범위 내

                if (bombs[i] == bombs[j]) {
                    nums[bombs[i]]++;
                    break;
                }
            }
        }
        
        int maxNum = -1;
       
        for (int i = 1 ; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }

        int result = 0;
        for (int i = 1 ; i < nums.length; i++) {
            if (maxNum == nums[i]){
                result = Math.max(result, i);
            }
        }
        System.out.print(result);
    }
}
