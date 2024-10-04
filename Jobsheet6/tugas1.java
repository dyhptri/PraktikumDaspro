import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.println("masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.println("masukkan biangan ketiga: ");
        int bil3 = input.nextInt();

        int bilanganTerbesar;

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                bilanganTerbesar = bil1;
            }
            else {
                bilanganTerbesar = bil3;
            }
        }
        else {
            if (bil2 >= bil3) {
                bilanganTerbesar = bil2;
            }
            else {
                bilanganTerbesar = bil3;
            }
        }
        System.out.println("bilangan terbesar" + bilanganTerbesar);
    }
}
