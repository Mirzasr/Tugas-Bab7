

public class Premium extends Pelanggan {

    public Premium(String nama, double hargaJasa, double hargaProduk) {
        super(nama, hargaJasa, hargaProduk);
        member = "Premium";
        diskon1 = "Diskon 20% untuk layanan jasa";
        diskon2 = "Diskon 10% dari pembelian produk";
    }

    @Override
    public void hargaJasa() {
        double diskon = hargaJasa * 0.2;
        hargaJasa = hargaJasa - diskon;
    }

    @Override
    public void hargaProduk() {
        double diskon = hargaProduk * 0.1;
        hargaProduk = hargaProduk - diskon;
    }
}
