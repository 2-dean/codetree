import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[201][201];

        int color = 1;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    map[x][y] = color;
                }
            }
            color++;
        }
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]> 1 && map[i][j] % 2 == 0) count++;
            }
        }
        // Please write your code here.
        System.out.print(count);
    }
}