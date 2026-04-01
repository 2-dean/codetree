import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String s = br.readLine();

        List<Integer> ones = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - '0'; 
            if (arr[i] == 1) {
                ones.add(i); // 1이 있는 위치를 싹 다 저장 ㅋ
            }
        }

        int maxDiff = 0;
        for (int k = 0; k < ones.size() - 1; k++) {
            int i = ones.get(k);// 현재 1
            int j = ones.get(k+1); //다음 1
            int diff = j - i - 1;
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.print(maxDiff / 2 + 1);
        
    }
}