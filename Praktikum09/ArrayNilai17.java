import java.util.Scanner;

public class ArrayNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        int totalNilai = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        int mahasiswaLulus = 0;
        int mahasiswaTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
            totalNilai += nilaiAkhir[i];

            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] > 70) {
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }

        double rataRata = (double) totalNilai / nilaiAkhir.length;

        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mahasiswaTidakLulus);

        sc.close();
    }
}