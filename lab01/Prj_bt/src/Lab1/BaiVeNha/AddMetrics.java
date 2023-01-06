package Lab1.BaiVeNha;

import java.util.Scanner;

public class AddMetrics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.print("Nhap so dong: ");
        m = scanner.nextInt();
        System.out.print("Nhap so cot: ");
        n = scanner.nextInt();
        int[][] metric1 = new int[m][n];
        int[][] metric2 = new int[m][n];
        int[][] sumMetric = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ cua Matric 1 [" + i + ", " + j + "]: ");
                metric1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ cua Matric 2 [" + i + ", " + j + "]: ");
                metric2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                sumMetric[i][j] = metric1[i][j] + metric2[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(sumMetric[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
