package Factory;

import java.util.*;

public class sdvsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        boolean isTransitive = checkTransitivity(arr, n);

        if (isTransitive) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkTransitivity(int[][] arr, int n) {

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][k] == 1 && arr[k][j] == 1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}



