import java.util.Scanner;

public class Segitiga17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sudut1, sudut2, sudut3, totalsudut;

        System.out.println("Masukkan sudut1");
        sudut1 = sc.nextInt();
        System.out.println("Masukkan sudut2");
        sudut2 = sc.nextInt();
        System.out.println("Masukkan sudut3");
        sudut3 = sc.nextInt();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else 
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan segitiga");

    }
}
