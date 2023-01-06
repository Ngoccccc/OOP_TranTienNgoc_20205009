package Lab1.BaiVeNha;

public class DisplayTriangle {
    public static void main(String[] args) {
        int n, i, j;

        n = 6; // khai bao so hang.

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (j = 1; j <= i; j++)
                System.out.print("*");
            for (j = 2; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

}
