import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int[] line = new int [c+1];


        int move = 0;
        while (true) {
            int diffLeft = b-a-1;
            int diffRight = c-b-1;

            // 이동공간 없음
            if (diffLeft == 0 && difRight == 0) break;

            if (diffLeft == 0 && diffRight > 0) { //앞은 공간 없고 오른쪽 공간있을때 왼쪽끝 -> 중간
                a = c-b;
                //a->b, b- >a
                int temp = a
                a = b;
                b =
                move++;
            } 
            if (diffRight == 0 && diffLeft > 0) { // 오른쪽 공간ㅇ 없고 왼쪽 이동가능할때
                c = b+1;
                move++;
            } 
            if () { // 바로 앞/뒤 인경우 중간으로
                
            } else if (diffRight == 0) {

            }
        }
    }
}