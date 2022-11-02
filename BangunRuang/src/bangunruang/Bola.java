package bangunruang;

public class Bola extends BangunRuang {

    float r;
    float phi = 22 / 7;

    public Bola(float r) {
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        this.luas = 4 * phi * (r * r);
    }


    @Override
    public void hitungVolume() {
        this.volume = 4 / 3 * phi * (r * r * r);
    }
}
