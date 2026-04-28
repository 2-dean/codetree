import java.util.Scanner;
public class Main {
    static int n;
    static int m;
    static int q;

    static int[][] building;
    static int[][] queries; 

    public static void rotate(int r1, int c1, int r2, int c2) {
        int temp = building[r1] [c1];

        for (int i = r1; i < r2; i++) { 
            building[i][c1] = building[i + 1][c1];
        }
        for (int i = c1 ; i < c2; i++) {
            building[r2][i] = building[r2][i + 1];
        }
        for (int i = r2 ; i > r1; i--) {
            building[i][c2] = building[i-1][c2];
        }
 
        for (int i = c2; i > c1 ; i--) {
            building[r1][i] = building[r1][i-1];
        }
     
        building[r1][c1 + 1] = temp; 
    }

    public static void updateBuilding(int r1, int c1, int r2, int c2) {
        int[][] temp = new int[n][m];
        for(int i=0; i<n; i++) temp[i] = building[i].clone();
        
        for (int i = r1; i <= r2; i++) { //row
            for (int j = c1; j <= c2; j++) { //col
                int sum = building[i][j];
                int count = 1;

                int[] dr = {-1, 1, 0, 0};
                int[] dc = {0, 0, -1, 1};
        
                for (int k = 0; k < 4; k++){
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                        sum += building[nr][nc];
                        count++;
                    }
                
                }
                temp[i][j] = sum / count; 
            }
        }
        for(int i=0; i<n; i++) building[i] = temp[i].clone(); // vuil
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        building = new int[n][m];
      
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                building[i][j] = sc.nextInt();
        
        queries = new int[q][4];
        for (int i = 0; i < q; i++)
            for (int j = 0; j < 4; j++)
                queries[i][j] = sc.nextInt();

        // Please write your code here.
        for (int i = 0; i < q; i++) {

            int r1 = (queries[i][0])-1;
            int c1 = (queries[i][1])-1;
            int r2 = (queries[i][2])-1;
            int c2 = (queries[i][3])-1;

            rotate(r1, c1, r2, c2);
            updateBuilding(r1, c1, r2, c2); 
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(building[i][j] + " ");
            }
            System.out.println();
        }
    }
}