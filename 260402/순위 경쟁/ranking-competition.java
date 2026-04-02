import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] ranks = new int[n+1];
        ranks[0] = 123;
        int a = 0; // 1
        int b = 0; // 2
        int c = 0; // 3
        
        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            int s = sc.nextInt();

            if (ch == 'A') a += s;
            if (ch == 'B') b += s;
            if (ch == 'C') c += s;

            // 승자 판별?
            // abc 같음 
            if (a == b && a == c && b == c) ranks[i + 1] = 123;
            // a가제일큼
            else if (a > b && a > c) ranks[i+1] = 1;
            // b가제일큼
            else if (b > a && b > c) ranks[i+1] = 2;
            // c가제일큼
            else if (c > a && c > b) ranks[i+1] = 4;
            // ab 같고제일큼
            else if (a == b && b > c) ranks[i+1] = 12;
            // ac 같고 제일큼
            else if (a == c && a > b) ranks[i+1] = 13;
            // bc 같고 제일큼
            else if (b == c && b > a) ranks[i+1] = 23;
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
           // System.out.println("ranks[" + (i-1) + "] = " + ranks[i-1] + ",  ranks["+ i +"] = "  +  ranks[i] );
            if (ranks[i] != ranks[i-1]) count++;
        }
        
        System.out.print(count);
    }
}