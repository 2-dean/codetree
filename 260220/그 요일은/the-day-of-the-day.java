import java.util.Scanner;

public class Main {
    // Please write your code here.  
    static int daySum (int m, int d) {
        int daySum = 0;
                                        //1, 2 ,  3,  4,  5,  6,  7,  8,  9  10  11  12
        int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < m; i++) {
            daySum += num_of_days[i];
        }        
        daySum += d;

        return daySum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        String[] strDay = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // A요일이 몇번 등장하는지 ?
        int diff = daySum(m2, d2) - daySum(m1, d1);
        int count = diff / 7;
        int remain = diff % 7;

        for (int i = 0 ; i <= remain; i++) {
            if (strDay[i].equals(A)) {
                count++;
            }
        }

        System.out.print(count);
     
    } 
}