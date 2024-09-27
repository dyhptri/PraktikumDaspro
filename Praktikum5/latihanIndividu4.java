import java.util.Scanner;

public class latihanIndividu4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan usia anda :");
        int usia = input.nextInt();

        if (usia >= 0 && usia <= 12){
            System.out.println("kategori usia anak-anak");
        }
        else if (usia >= 13 && usia <= 19){
            System.out.println("kategori usia remaja");
        }
        else if (usia >= 20 && usia <= 64){
            System.out.println("kategori usia dewasa");
        }
        else if (usia >= 65){
            System.out.println("kategori usia lansia");
        }
        else {
            System.out.println("data anda tidak valid");
        }

    }
}