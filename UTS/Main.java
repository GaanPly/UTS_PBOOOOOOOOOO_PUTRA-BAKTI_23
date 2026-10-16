package PBO.UTS;

public class Main {
    public static void main(String[] args) {
        Restoran restoran = new Restoran("Kedai Tugu", 5);
        Koki chefArif = new Koki("Chef Arif");
        restoran.setKepalaDapur(chefArif);

        Pelayan rina = new Pelayan("Rina");
        Kasir kasir = new Kasir("Andi");

        Meja meja2 = restoran.getMeja(2);
        meja2.setPelayan(rina);
        meja2.setKoki(chefArif);

        Makanan nasiGoreng = new Makanan("Nasi Goreng", 25000, true);
        Minuman esTeh = new Minuman("Es Teh", 8000, "L");

        meja2.pesan(nasiGoreng);
        meja2.Pesan(esTeh, 2);

        kasir.cetakBill(meja2);
    }
}
