import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int [2001][2001];
        int rect1_x1 = sc.nextInt()+1000;
        int rect1_y1 = sc.nextInt()+1000;
        int rect1_x2 = sc.nextInt()+1000;
        int rect1_y2 = sc.nextInt()+1000;

        int rect2_x1 = sc.nextInt()+1000;
        int rect2_y1 = sc.nextInt()+1000;
        int rect2_x2 = sc.nextInt()+1000;
        int rect2_y2 = sc.nextInt()+1000;
        // Please write your code here.

        for (int i = rect1_x1; i < rect1_x2; i ++ ) {
            for (int j = rect1_y1; j < rect1_y2; j ++ ) {
                paper[i][j] = 1;
            }
        }

        for (int i = rect2_x1; i < rect2_x2; i ++ ) {
            for (int j = rect2_y1; j < rect2_y2; j ++ ) {
                paper[i][j] = 0;
            }
        }

        // 가장 왼쪽/ 가장오른쪽 끝점 찾기
        int minX = 2001;
        int maxX = 0;
        int minY = 2001;
        int maxY = 0;
        boolean found = false;

        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (paper[i][j] == 1) {
                    found = true;
                    if (i < minX) minX = i;
                    if (i > maxX) maxX = i;
                    if (j < minY) minY = j;
                    if (j > maxY) maxY = j;  
                }
            }
        }

        if (!found) {
            System.out.print(0);
        } else {
            int width = maxX - minX + 1;
            int height = maxY - minY + 1;
            System.out.print(width * height);
        }
    }
}