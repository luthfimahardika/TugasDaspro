import java.util.Scanner;

public class Kabinet17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Tahun");
        int tahun = sc.nextInt();

        if ((tahun % 4) == 0 || (tahun % 100) != 0  && (tahun % 400) ==0){
            System.out.println("Tahun Kabisat"); 
        } 
            
        else {
            System.out.println("Bukan Tahun Kabisat");
        }
        }
    }
