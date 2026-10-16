package PBO.UTS;

public class Makanan extends Menu {
    private boolean porsiJumbo;

    public Makanan(String nama, int hargaDasar, boolean porsiJumbo) {
        super(nama, hargaDasar);
        this.porsiJumbo = porsiJumbo;
    }

    @Override
    public int hitungHarga() {
        if (porsiJumbo) {
            return (int) (super.hitungHarga() * 1.3);
        }
        return super.hitungHarga();
    }

}
