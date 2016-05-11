

import java.util.Scanner;

public class MainSalon {

    private static String nama;
    private static double hargaJasa, hargaProduk;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Selamat Datang di Salon Kecantikan");
            System.out.println("Pilih member : ");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Non Member");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    addTariff();
                    Pelanggan p = new Premium(nama, hargaJasa, hargaProduk);
                    sumTariff(p);
                    break;
                case 2:
                    addTariff();
                    Pelanggan g = new Gold(nama, hargaJasa, hargaProduk);
                    sumTariff(g);
                    break;
                case 3:
                    addTariff();
                    Pelanggan s = new Silver(nama, hargaJasa, hargaProduk);
                    sumTariff(s);
                    break;
                case 4:
                    addTariff();
                    Pelanggan nm = new NonMember(nama, hargaJasa, hargaProduk);
                    sumTariff(nm);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    public static void addTariff() {
        System.out.print("Nama     : ");
        nama = in.next();
        System.out.print("Tarif layanan jasa : IDR ");
        hargaJasa = in.nextDouble();
        System.out.print("Tarif produk       : IDR ");
        hargaProduk = in.nextDouble();
    }

    public static void sumTariff(Pelanggan a) {
        a.hargaJasa();
        a.hargaProduk();
        a.displayMessage();
    }
}
