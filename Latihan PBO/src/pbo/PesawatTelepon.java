package pbo;

public class PesawatTelepon {

    String bentuk,kabel,gagang_telepon;

    public String getBentuk() {
        return bentuk;
    }

    public String getKabel() {
        return kabel;
    }

    public String getGagang_telepon() {
        return gagang_telepon;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public void setGagang_telepon(String gagang_telepon) {
        this.gagang_telepon = gagang_telepon;
    }

    Boolean terima_panggilan(Boolean terima){
        return terima;
    }

    Boolean melakukan_panggilan(Boolean panggil){
        return panggil;
    }
}
