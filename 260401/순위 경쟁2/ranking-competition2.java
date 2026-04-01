import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] rank = new char[n];
        
        int pointA = 0;
        int pointB = 0;

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            if(c == 'A') {
                pointA += s;
            } else {
                pointB += s;
            }

            if (pointA > pointB) {
                rank[i] = 'A';
            } else if (pointB > pointA) {
                rank[i] = 'B';
            } else{
                rank[i] = 'C'; 
            }
            //System.out.println("rank[" + i + "]" + rank[i]);
        }
        // Please write your code here.
        int count = 1;
        for (int i  = 1; i < n; i++) {
            if (rank[i-1] != rank[i]) count++;
        }

        System.out.print(count);
    }
}