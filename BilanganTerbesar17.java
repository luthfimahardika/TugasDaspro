import java.util.Scanner;

public class BilanganTerbesar17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3, bilanganTerbesar;

        System.out.println("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();

        bilanganTerbesar = bil1 > bil2 ? (bil1 > bil3 ? bil1 : (bil1 > bil3 ? bil1 : bil3)) : (bil1 > bil3 ? bil2 : (bil2 > bil3 ? bil2 : bil3));

        System.out.println("bilangan terbesar: " + bilanganTerbesar);
        bilanganTerbesar = sc.nextInt();

    }
}
