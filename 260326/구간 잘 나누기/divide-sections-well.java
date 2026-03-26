import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        // Please write your code here.


        // 구간 합의 최댓값 후보
        for (int x = 1; x <= 100000; x++){
            int partSum = 0;
            int partition = 1; //첫번째 구간부터
            boolean possible = true;

            for (int i = 0 ; i < n ; i++) { 
                if (nums[i] > x) { // 최댓값 보다 크면 못담음!
                    possible = false;
                    break;
                }            
                if (partSum + nums[i] <= x) {  //최댓값에 담을 수 있으면 담기
                    partSum += nums[i];
                } else {
                    // 꽉찼으면 파티션 나누기
                    partition++;
                    partSum = nums[i]; // 다음칸의 첫 번째값
                }
            }
            if (possible && partition <= m) {
                System.out.print(x); // 그 바구니 크기(x)가 바로 정답!
                return; 
            }
        }

       
    }
}