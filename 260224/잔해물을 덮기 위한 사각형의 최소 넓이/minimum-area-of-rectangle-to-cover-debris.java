import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int [2001][2001];
        int rect1_x1 = sc.nextInt()+100;
        int rect1_y1 = sc.nextInt()+100;
        int rect1_x2 = sc.nextInt()+100;
        int rect1_y2 = sc.nextInt()+100;

        int rect2_x1 = sc.nextInt()+100;
        int rect2_y1 = sc.nextInt()+100;
        int rect2_x2 = sc.nextInt()+100;
        int rect2_y2 = sc.nextInt()+100;
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
        int minX = 201;
        int maxX = 0;
        int minY = 201;
        int maxY = 0;
        boolean found = false;

        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (paper[i][j] == 1) {
                    if (i < minX) minX = i;
                    if (i > maxX) maxX = i;
                    if (j < minY) minY = j;
                    if (j > maxY) maxY = j;  
                }
            }
        }

  
            int width = maxX - minX +1; //칸 
            int height = maxY - minY + 1;
            System.out.print(width * height);

  
        
    }
}