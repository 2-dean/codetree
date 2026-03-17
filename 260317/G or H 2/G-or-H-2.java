import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxPos = 100;
        char[] arr = new char[101];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            arr[position] = ch;
        }
        // Please write your code here.
     
        int maxDist = 0;

        for (int i = 0; i < arr.length; i++) {
            // g 만 있음, h만 있음, g, h 모두 다 
            if (arr[i] == 'G' || arr[i] == 'H') {
                int cntG = 0;
                int cntH = 0;

                //  끝점 찾기
                for(int j = i; j < arr.length; j++){
                    if(arr[j] == 'G') cntG++;
                    if(arr[j] == 'H') cntH++;

                    if(arr[j] == 'G' || arr[j] == 'H') {
                         //모두 g or h
                        if ((cntG > 0 && cntH == 0) || (cntG == 0 && cntH > 0) || (cntG == cntH)) {
                            int dist = j - i; // 끝좌표 - 시작좌표
                            maxDist = Math.max(maxDist, dist);
                        }
                    }
                }
            } 

        } 
        System.out.print(maxDist);
    }
}