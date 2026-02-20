import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
                                         //1, 2 ,  3,  4,  5,  6,  7,  8,  9  10  11  12
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] strDay = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    
        int from = d1;
        for(int i = 0; i < m1; i++) {
            from += num_of_days[i];
        }
        int to = d2; 
        for(int i = 0; i < m2; i++) {
            to += num_of_days[i];
        }

        int daySum = to - from;
        int left = daySum % 7;

        if (left > 0) {
            System.out.println(strDay[left]);
        } else {
            System.out.println(strDay[strDay.length + left]);
        }
        
    }
}