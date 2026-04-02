import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
            if (num % 2 == 0) even++;
            else odd++;
        }

        int cnt = 0;
        int target = 0; // 0 짝수차례 1  홀수차례
        
        while (true) {
            if (target == 0) {
                if (even > 0) {
                    even--;
                    cnt++;
                } else if (odd >=2 ){
                    odd -= 2;
                    cnt++;
                } else { // 남은 홀수가 1개인데 짝수만들차례
                    if (odd > 0) cnt--;
                    break;
                }   
                target = 1; // 홀수차례로 넘김
            } else {
                if (odd > 0) {
                    odd--;
                    cnt++;
                    target = 0; // 짝수로 넘김
                } else {
                    break;
                }
            }

        }


        System.out.print(cnt);
    }
}