package PBO.UTS;

public class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, int hargaDasar, String ukuran) {
        super(nama, hargaDasar);
        this.ukuran = ukuran;
    }

    @Override
    public int hitungHarga() {
        if (ukuran.equalsIgnoreCase("S")) {
            return (int) (super.hitungHarga() * 1);
        }
        else if (ukuran.equalsIgnoreCase("M")) {
            return (int) (super.hitungHarga() * 1);
        }
        else if (ukuran.equalsIgnoreCase("L")) {
            return (int) (super.hitungHarga() + 5000);
        }
        else {
            System.out.println("Ukuran tidak valid. Menggunakan harga dasar.");
        }
        return super.hitungHarga();
    }
}
