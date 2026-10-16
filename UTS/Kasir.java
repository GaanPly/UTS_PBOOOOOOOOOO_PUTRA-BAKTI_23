package PBO.UTS;

public class Kasir {
    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    public void cetakBill(Meja meja) {
        System.out.println("Bill untuk meja " + meja.getNomorMeja() + ":");
        System.out.println("Nama Kasir: " + nama);
        System.out.println("Nama Pelayan: " + meja.getPelayan().getNama());
        System.out.println("Nama Koki: " + meja.getKoki().getNama());
        System.out.println("Daftar Menu:");
        for (Menu menu : meja.getPesanan()) {
            if (menu != null) {
                System.out.println("- " + menu.getNama() + ": Rp" + menu.hitungHarga());
            }
        }
        System.out.println("Total Harga: Rp" + (int)(meja.hitungSubTotal() * 1.1));
    }
}
