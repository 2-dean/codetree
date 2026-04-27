import java.util.Scanner;

public class Main { 
    static int n;
    static int m;
    static int q;
    static int[][] arr;

    static void shift(int row, int dir) {
        if(dir == 0) { // 오른쪽
            int temp = arr[row][m-1];
            for (int i = m-1; i >= 1; i--) {
                arr[row][i] = arr[row][i-1];
            }
            arr[row][0] = temp;
        } else { // 왼쪽밀기
            int temp = arr[row][0];
            for (int i = 0; i < m - 1; i++){
                arr[row][i] = arr[row][i+1];
            }
            arr[row][m-1] = temp;
        }
    }

    static boolean canSpread (int row1, int row2) {
        // 범위체크
        if (row1 < 0 || row1 >= n || row2 < 0 || row2 >= n) return false; 

        for (int i = 0; i < m; i++) {
            if(arr[row1][i] == arr[row2][i]) return true;
        }
        return false; // 중복되는거 없는 경우
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        arr = new int[n][m];

        //입력받기 
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int r = sc.nextInt() - 1;
            char dir = sc.next().charAt(0);
            int d = (dir == 'L') ? 0 : 1;  // l 바람 > 오른쪽으로 이동

            // 처음 바람 불기
            shift(r, d);

            // 위로 전파
            int currDir = d; 
            for (int j = r; j > 0 ; j--) {
                if (canSpread(j, j-1)) {
                    currDir = (currDir == 0) ? 1 : 0; // 방향반대로
                    shift(j - 1, currDir);
                } else {
                    break;
                }
                
            }
      
            // 아래 로전파
            currDir = d;
            for (int j = r; j < n-1; j++) {
                if (canSpread(j, j+1)) {
                    currDir = (currDir == 0) ? 1 : 0; // 방향반대로
                    shift(j + 1, currDir);
                } else{
                    break;
                }
            }
            
        }
        // Please write your code here.

                //입력받기 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print (arr[i][j] + " ");    
            }
            System.out.println();
        }
    }
}