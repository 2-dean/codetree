import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] b = new int[11];
        Arrays.fill(b, -1);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();

            if (b[pigeon] == -1) {
                b[pigeon] = moveDir;
            } else if (b[pigeon] != moveDir) {  
                cnt++; //건너감
                b[pigeon] = moveDir;
            } 
        }
        // Please write your code here.


        System.out.print(cnt);
    }
}