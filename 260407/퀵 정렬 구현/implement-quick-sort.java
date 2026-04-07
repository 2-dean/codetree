import java.util.Scanner;

public class Main {
    static int[] arr;

    // 1. Swap은 반드시 이렇게 짜야 합니다! ㅋ ㅡㅡ;
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        // 보통 맨 뒤(high)를 피벗으로 잡습니다 ㅋ 🦾
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) { // j 선언 추가 ㅋ
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // 배열과 인덱스 전달!
            }
        }
        // 피벗을 자기 자리(i+1)로 옮기기 ㅋ ㅡㅡ;
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pos = partition(arr, low, high); // pos 선언 ㅋ 🦾

            quickSort(arr, low, pos - 1); // 피벗 왼쪽 정렬 ㅋ
            quickSort(arr, pos + 1, high); // 피벗 오른쪽 정렬 ㅋ
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 퀵 정렬 시작! 
        quickSort(arr, 0, n - 1);

        // 결과 출력 ㅋ 🦾
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}