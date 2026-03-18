import java.util.*;
import java.io.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new int[] {x, y};
        }

        // 사각형의 최소넓이 구하기
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n;  i++) {
            int w = 0;
            int h = 0;

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;
                
            for (int j = 0; j < n; j++) {
                if (i == j) continue; //  하나씩 빼보기

                int x = arr[j][0]; 
                int y = arr[j][1];
                
               
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);

                w = maxX-minX;
                h = maxY-minY;
            }       
    
            int box = w * h;
            ans = Math.min(ans, box);
            
        }
        System.out.print(ans);
    } 
}