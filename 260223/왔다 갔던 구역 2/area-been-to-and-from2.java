import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line = new int [22];
        int N = sc.nextInt();
        int idx = 9;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            x += 10; // 10 더해스 음수 없게
            if (dir == 'L') {
                for (int j = x-1; j >= idx; j--) {
                    line[j]++;
                } 
            } else {
                for (int k = idx; k < x; k++) {
                    line[k]++;
                    idx = k;
                } 
            }
        }
        int count = 0;
        for (int box :line) {
            //System.out.println (box);
            if (box >= 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}