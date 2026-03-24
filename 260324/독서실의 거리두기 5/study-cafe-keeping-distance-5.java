import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        // Please write your code here.
        int[] seat = new int[n];

        for(int i = 0; i < n; i++) {
            seat[i] = s.charAt(i)-'0';
        }

        int maxDiff = 0;
        // 모든자리에 넣어보고 diff 구하기
        for (int i = 0; i < n; i++) {
            if (seat[i] == 0) { //비어있으면
                seat[i] = 1;
                int diff = n;
                // 가까운 다른사람
                int lastPos  = -1;
                for (int j = 0; j < n; j++) {
                    if (seat[j] == 1) {
                        if (lastPos != -1) {
                            diff = Math.min(diff, j - lastPos);
                        }
                        lastPos = j;
                    }
                }
                maxDiff = Math.max(diff, maxDiff); 
                seat[i] = 0;
            }
        
        
        }

        System.out.print(maxDiff);

    } 
}