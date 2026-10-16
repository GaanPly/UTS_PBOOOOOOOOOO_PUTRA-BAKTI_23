package PBO.UTS;

public class Meja {
    private int nomor;
    private Menu[] pesanan = new Menu[5];
    private int jumlahPesanan = 0;
    private Pelayan pelayan;
    private Koki koki;

    public Meja(int nomor) {
        this.nomor = nomor;
    }

    public void setPelayan(Pelayan pelayan) {
        this.pelayan = pelayan;
    }

    public Pelayan getPelayan() {
        return pelayan;
    }

    public void setKoki(Koki koki) {
        this.koki = koki;
    }

    public Koki getKoki() {
        return koki;
    }

    public int getNomorMeja() {
        return nomor;
    }

    public Menu[] getPesanan() {
        return pesanan;
    }

    public void pesan(Menu m) {
        if (jumlahPesanan < pesanan.length) {
            pesanan[jumlahPesanan] = m;
            jumlahPesanan++;
        } else {
            System.out.println("Meja penuh, tidak bisa menambah pesanan.");
        }
    }

    public void Pesan(Menu m, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            if (jumlahPesanan < pesanan.length) {
                pesanan[jumlahPesanan] = m;
                jumlahPesanan++;
            } else {
                System.out.println("Meja penuh, tidak bisa menambah pesanan.");
                break;
            }
        }
        
    }

    public int hitungSubTotal() {
        int total = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            total += pesanan[i].hitungHarga();
        }
        return total;
    }
}
