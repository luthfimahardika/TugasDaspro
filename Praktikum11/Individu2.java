import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = sc.nextInt();

        if (n > 2 && n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
             
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n | j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Angka tidak valid");
        }
    }
}
