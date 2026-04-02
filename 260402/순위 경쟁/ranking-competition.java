import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] ranks = new int[n+1];
        ranks[0] = 7; // 처음엔 0,0,0으로 다 같으니까 1+2+4 = 7로 시작 ㅋ ㅡㅡ;        
        int a = 0; // 1
        int b = 0; // 2
        int c = 0; // 4
        
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            int s = sc.nextInt();

            if (ch == 'A') a += s;
            if (ch == 'B') b += s;
            if (ch == 'C') c += s;

            // 최댓값 찾기
            int m = Math.max(a, Math.max(b, c));

            // 상태 숫자 만들기
            int status = 0;
            if (a == m) status += 1;
            if (b == m) status += 2;
            if (c == m) status += 4;
            
            ranks[i + 1] = status;
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
           // System.out.println("ranks[" + (i-1) + "] = " + ranks[i-1] + ",  ranks["+ i +"] = "  +  ranks[i] );
            if (ranks[i] != ranks[i-1]) count++;
        }
        
        System.out.print(count);
    }
}