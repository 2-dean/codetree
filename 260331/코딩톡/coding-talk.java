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

        // p번째 메시지를 모두 읽었으면 
        if (u[p-1] == 0) {
            return;
        } 

        char[] user = new char[N];
        for (int i = 0 ;  i < N; i++) {
            user[i] = (char)('A' + i);
        } 

        // p번째 이후에 읽은사람 지우기
        // p 번째와 안읽은 사람 수가 같은 모든 메시지의 발신자는 읽은사람임
        for (int i = 0; i < M; i++) {
            // 1. p번째 메시지 이후에 글을 남긴사람
            // 2. p번째 메시지와 안읽은 사람 수가 똑같은 메시지를 남긴사람
            if (i >= p-1 || u[i] == u[p-1]) {
                for (int j = 0; j < N; j++) {          
                    if (c[i] == user[j]) {
                        user[j] = '0';
                    }
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
