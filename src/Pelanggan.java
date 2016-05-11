

public abstract class Pelanggan {

    protected String nama, member, diskon1, diskon2;
    protected double hargaJasa, hargaProduk;

    public Pelanggan(String nama, double hargaJasa, double hargaProduk) {
        this.nama = nama;
        this.hargaJasa = hargaJasa;
        this.hargaProduk = hargaProduk;
    }

    public abstract void hargaJasa();

    public abstract void hargaProduk();

    public void displayMessage() {
        System.out.println("=========================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Status Member   : " + member);
        System.out.println(diskon1);
        System.out.println("Biaya Layanan   : IDR " + hargaJasa);
        System.out.println(diskon2);
        System.out.println("Biaya Produk    : IDR " + hargaProduk);
        System.out.println("-----------------------------------------");
        System.out.println("Total Biaya     : IDR " + (hargaJasa + hargaProduk));
        System.out.println("=========================================\n");
    }
}
