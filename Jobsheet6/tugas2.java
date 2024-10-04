import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenis;
        int jumlah, harga;
        double hargaDiskon, diskon, jumlahDiskon;

        System.out.println("masukkan jumlah buku: ");
        jenis=input.nextLine();
        System.out.println("masukkan jumlah buku: ");
        jumlah=input.nextInt();
        System.out.println("masukkan harga buku: ");
        harga=input.nextInt();

        if (jenis.equals("novel")) {
            diskon = (1.0 - 0.1) * jumlah * harga;
            if (jumlah > 2){
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (diskon);
            }
        } else if  (jenis.equals("novel")) {
            diskon = (1.0 - 0.07) * jumlah * harga;
            if (jumlah > 3){
                hargaDiskon = (1.0 - 0.02) * diskon;
            } else {
                hargaDiskon = (1.0 - 0.01) * diskon;
            }
        } else {
            if (jumlah > 3){
                hargaDiskon = (1.0 - 0.05) * harga * jumlah;
            } else {
                hargaDiskon = 0;
            }
        }
        System.out.println("Total harga setelah diskon: " + hargaDiskon);
        jumlahDiskon = (harga * jumlah) - hargaDiskon;
        System.out.println("Jumlah diskon (Rp): " + jumlahDiskon);
        
       
    }
   
}
