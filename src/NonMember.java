

public class NonMember extends Pelanggan {

    public NonMember(String nama, double hargaJasa, double hargaProduk) {
        super(nama, hargaJasa, hargaProduk);
        member = "Non-member";
        diskon1 = "Tidak mendapatkan diskon untuk layanan jasa";
        diskon2 = "Tidak mendapatkan diskon untuk pembelian produk";
    }

    @Override
    public void hargaJasa() {
        super.hargaJasa = hargaJasa;
    }

    @Override
    public void hargaProduk() {
        super.hargaProduk = hargaProduk;
    }
}
