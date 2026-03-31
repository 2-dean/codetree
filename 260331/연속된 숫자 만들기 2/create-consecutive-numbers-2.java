import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        
        // 1. 일단 정렬해서 순서를 잡아야 계산이 편합니다.
        Arrays.sort(arr);
        int a = arr[0], b = arr[1], c = arr[2];

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