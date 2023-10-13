import java.util.Scanner;

public class Bilangan17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int bil1, bil2, bil3;

    System.out.println("Masukkan bilangan 1");
    bil1 = sc.nextInt();
    System.out.println("Masukkan bilangan 2");
    bil2 = sc.nextInt();
    System.out.println("Masukkan bilangan 3");
    bil3 = sc.nextInt();

    if(bil1 > bil2){
        if(bil2 > bil3){
            System.out.println("Bilangan terbesar: " + bil1);
        } else{
            if(bil1 > bil3){
                System.out.println("bilangan terbesar adalah" + bil1);
            } else{
                System.out.println("bilangan terbesar adalah" + bil3);
            }
        }
    }else{
        if(bil1 > bil3){
            System.out.println("Bilangan terbesar: " + bil2);
        } else{
            if(bil2 > bil3){
                System.out.println("Bilangan terbesar: " + bil2);
            } else{
                System.out.println("Bilangan terbesar: " + bil3);
            }
        }
        
    }
    }
}