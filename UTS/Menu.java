package PBO.UTS;

public class Menu {
    protected String nama;
    protected int hargaDasar;

    public Menu(String nama, int hargaDasar) {
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getNama() {
        return nama;
    }

    public int hitungHarga() {
        return hargaDasar;
    }
}
