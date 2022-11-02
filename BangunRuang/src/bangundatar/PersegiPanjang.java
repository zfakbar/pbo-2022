package bangundatar;

public class PersegiPanjang extends BangunDatar {

    float p, l;


    public PersegiPanjang(float p, float l){
        this.p = p;
        this.l = l;

    }

    @Override
    public void hitungLuas() {
        this.luas = p * l;
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 2 * (p + l);
    }
}
