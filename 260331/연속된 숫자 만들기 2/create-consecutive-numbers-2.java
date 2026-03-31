import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        // 양 끝 사람을 가운데로 넣기
        int count = 0;
        if (Math.abs(c-b) >= 2) count++;
        if (Math.abs(a-b) >= 2) count++;

        System.out.print(count);

    }
}