import java.util.Scanner;

public class PEMILIHAN2PERCOBAAN11107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tahun: ");
        int tahun = input.nextInt();

        if ((tahun % 4) ==0) {
            if ((tahun % 100) ==0){
                if((tahun % 400) ==0){
                    System.out.println("tahun kabisat");
                } else {
                    System.out.println("bukan tahun kabisat");
                }
            } else {
                System.out.println("tahun kabisat");
            }
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}
