package PBO.UTS;

public class Restoran {
    private String nama;
    private Meja[] daftarMeja;
    private Koki kepalaDapur;

    public Restoran(String nama, int jumlahMeja) {
        this.nama = nama;
        this.daftarMeja = new Meja[jumlahMeja];
        for (int i = 0; i < jumlahMeja; i++) {
            daftarMeja[i] = new Meja(i + 1);
        }
    }

    public void setKepalaDapur(Koki kepalaDapur) {
        this.kepalaDapur = kepalaDapur;
    }

    public Meja getMeja(int nomorMeja) {
        if (nomorMeja >= 1 && nomorMeja <= daftarMeja.length) {
            return daftarMeja[nomorMeja - 1];
        }
        return null;
    }

    public void tampilInfo() {
        System.out.println("Restoran: " + nama);
        System.out.println("Kepala Dapur: " + (kepalaDapur != null ? kepalaDapur.getNama() : "Belum ditentukan"));
        System.out.println("Jumlah Meja: " + daftarMeja.length);
    }
}
