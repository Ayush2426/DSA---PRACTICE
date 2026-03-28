import java.util.*;

public class SearchArrayy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int target = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if (i == target) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
