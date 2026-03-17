import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();  // h 높이가 되게 
        int t = sc.nextInt(); //최소t번이상
        int[] arr = new int[n];

        int minTotCost = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n - t; i++){
            int temp = 0;
            for(int j = i; j < i + t; j++) { //길이가 t인 구간
                temp += Math.abs(h - arr[j]);
            }

            minTotCost = Math.min(temp, minTotCost);
        }
        System.out.print(minTotCost);
    }
}