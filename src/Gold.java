

public class Gold extends Pelanggan {

    public Gold(String nama, double hargaJasa, double hargaProduk) {
        super(nama, hargaJasa, hargaProduk);
        member = "Gold";
        diskon1 = "Diskon 15% untuk layanan jasa";
        diskon2 = "Diskon 10% dari pembelian produk";
    }

    @Override
    public void hargaJasa() {
        double diskon = hargaJasa * 0.15;
        hargaJasa = hargaJasa - diskon;
    }

    @Override
    public void hargaProduk() {
        double diskon = hargaProduk * 0.1;
        hargaProduk = hargaProduk - diskon;
    }

}
