import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] line = new char[200000];
            
        int cur = 100000; // 중간에서 시작
        for (int i = 0; i < n; i++) {
            int dist = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {// 왼쪽. 흰 10, dist 3 -> 10/9/8/ cur => 8 
                for (int j = cur; j > cur - dist; j--) {
                 
                    line[j] = 'W';
                }
                cur = cur - dist + 1;
            } else { // 오른쪽, 검 10, 3 -> 10/11/12 cur => 12 
                for (int k = cur; k < cur + dist; k++) {
                   
                    line[k] = 'B';
                }
                cur = cur + dist -1;
            }
        }
        int w = 0;
        int b = 0;
        // Please write your code here.
        for (char c : line ) {
            if (c == 'W') w++;
            if (c == 'B') b++;
        }
        System.out.print(w + " " + b);
    }
}