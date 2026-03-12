import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); //row 세로
        int C = sc.nextInt(); //col 가로
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        // 현재 <> 점프칸 색 달라야함 
        // 이동 은 한칸 이상 오른쪽 & 한칸이상 아래쪽 
        
        int count = 0;

        int x =0;
        int y =0;
        for (int i = 1 ; i < R; i ++) {
            for (int j = 1; j < C; j++) {
                for (int k = i +1 ; k < R - 1 ; k ++) {
                    for (int l = j + 1; l < C -1 ; l++){                   
                        // 색이 전부 달라지는 경우에만 
                        if (grid[0][0] != grid[i][j] && // 시작 <> 첫번째 점프지
                            grid[i][j] != grid[k][l] && // 첫번째  <> 두번째
                            grid[k][l] != grid[R-1][C-1] // 두번째 점프지 <> 마지막
                        ) count++;
            
                    }
                }    
            
            }
        }
        System.out.print(count);
    }
}