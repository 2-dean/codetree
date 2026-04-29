import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int dir = sc.nextInt(); 
        // Please write your code here.

        List<int[]> path = new ArrayList<>();
        int currR = r, currC = c;

        int[] moveDr = {-1, -1, 1, 1};
        int[] moveDc = {1, -1, -1, 1}; 
        int[] m = {m1, m2, m3, m4};

        for(int i = 0; i < 4; i++) {
            for (int j =0 ; j < m[i]; j++) {
                path.add(new int[]{currR, currC}); 
                currR += moveDr[i];
                currC += moveDc[i];
            }
        }

        List<Integer> values = new ArrayList<>();
        for(int[] pos : path) {
            values.add(grid[pos[0]][pos[1]]);
        }
        
        if (dir == 0) {
            int last = values.remove(values.size()-1);
            values.add(0, last);
        } else { 
            int first = values.remove(0);
            values.add(first);
        }


        for (int i = 0; i < path.size(); i++) {
            int[] pos = path.get(i);
            grid[pos[0]][pos[1]] = values.get(i);
        }

        //print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }

    
    }


}