import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String s = br.readLine();

        
   
        //List<Integer> ones = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0'; 
           
        }

        int totalMaxDist = 0;
  
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) { // 빈자리
                arr[i] = 1; // 앉힘

                // 현재 배치에서 가장 가까운 두사람 거리 
                int minDist = n; 
                List<Integer> ones = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if (arr[j] == 1) ones.add(j);
                }
                //System.out.println();

                for (int k = 0; k < ones.size() - 1; k++) {
                    int dist = ones.get(k + 1) - ones.get(k); // 인덱스차
                    //System.out.println(dist);
                    minDist = Math.min(minDist, dist);
                }
                totalMaxDist = Math.max(totalMaxDist, minDist);
                arr[i] = 0;//원복
            }
        }

        System.out.println(totalMaxDist);
        
    }
}
