import java.util.Scanner;

    public class siakad07 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String nama, nim, nilaiHuruf;
            char kelas;
            byte absen;
            double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

            System.out.println("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan Nim: ");
            nim = sc.nextLine();
            System.out.println("Masukkan Kelas: ");
            kelas = sc.next().charAt(0);
            System.out.println("Masukkan nomor absen: ");
            absen = sc.nextByte();
            System.out.println("masukkan nilai kuis: ");
            nilaiKuis = sc.nextInt();
            System.out.println("masukkan nilai tugas: ");
            nilaiTugas = sc.nextInt();
            System.out.println("Masukkan nilai ujian : ");
            nilaiUjian = sc.nextInt();
            
            nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 ) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 ){
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf ="C+";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.println("Mahasiswa dengan nama " + nama + " (NIM" + nim + ") " + "kelas " + kelas + " nomor absen " + absen);
            System.out.println("Nilai akhir: " + nilaiAkhir);

            switch (nilaiHuruf) {
                case "A":
                System.out.println("Nilai akhir huruf: A");
                System.out.println("kualisifikasi: sangat baik");
                    break;
            case "B":
                System.out.println("Nilai akhir huruf: B+");
                System.out.println("kualifikasi: lebih baik");
            case "C+":
                System.out.println("Nilai akhir huruf: C+");
                System.out.println("Kualifikasi: Lebih dari cukup");  
                break;
            case "C":
                System.out.println("Nilai akhir huruf: C");
                System.out.println("Kualifikasi: Cukup");
                break;
            case "D":
                System.out.println("Nilai akhir huruf: D");
                System.out.println("Kualifikasi: Kurang");
                break;
            case "E":
                System.out.println("Nilai akhir huruf: E");
                System.out.println("Kualifikasi: Gagal");
                break;
                    
            }
        }
        
    }
