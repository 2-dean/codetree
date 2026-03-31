import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        // 양 끝 사람을 가운데로 넣기
        if (a+1 == b && b+1 == c){
            System.out.print(0);
        } else if (b - a == 2|| c - b == 2) {
            System.out.print(1);
        } else{
            System.out.print(2);
        }


    }
}