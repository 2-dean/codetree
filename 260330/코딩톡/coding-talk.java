import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 전체인원
        int M = sc.nextInt(); // 메시지 수
        int p = sc.nextInt(); // p번째 메시지를 읽지 않았을 가능성이 있는 사람의 이름 구하기
        char[] c = new char[M]; // 
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        // Please write your code here.
        
        char[] user = new char[N];
        for (int i = 0 ;  i < N; i++) {
            user[i] = (char)('A' + i);
        } 
        // p번째 이후에 없는 사람~?
        for (int i = p - 1; i < M; i++) {
            for (int j = 0; j < N; j++) {

                if (c[i] == user[j]) {
                    user[j] = '0';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (user[i] != '0') {
                System.out.print(user[i] + " ");
            }
        }
    }
}