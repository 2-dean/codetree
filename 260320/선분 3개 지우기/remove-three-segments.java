import java.util.Scanner;

public class Main {
    public static final int MAX_A = 100;
    public static final int MAX_N = 10;
    public static int n = sc.nextInt();
    public static int[] l = new int[n];
    public static int[] r = new int[n];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
   
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
    
        int ans = 0;
        // 뺄 선분 3개를 고른다(i, j, k번 선분을 뺀다)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    boolean overlap = false;
                    int[] arr = new int[MAX_A + 1];

                    for (int x = 0 ; x < n; x++) {
                        // 제외한 선분은 넘어감
                        if (x == i || x == j || x == k) 
                            continue;
                        for (int y = l[x]; y <= r[x]; y++) {
                            arr[y]++;
                        }
                    }

                    for (int x = 0; x <= MAX_A; x++) {
                        if(arr[x] > 1)
                            overlap = true;
                    }

                    if (overlap == false) 
                        ans++;
                    
                }
            }
        }
        System.out.print(ans);

    }
}