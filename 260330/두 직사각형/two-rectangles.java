import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
      
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        
        //  겹치지 않는경우

        if (a1 > x2 
        || a2 > x1
        || y2 > b2
        || y2 > b2) {
            System.out.print("overlapping");
        } else {
            System.out.print("nonoverlapping");
        }
    }
}