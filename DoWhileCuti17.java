import java.util.Scanner;

public class DoWhileCuti17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatuh cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatuh cuti Anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);
    }
}
