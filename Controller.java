package TiketPesawat;

/**
 *
 * @author FARREL ANDHIKA RIZKY PUTRA - 24060120130071
 */

public class Controller {
    private Model m;

    Controller(){
        this.m = new Model();
    }
    public void setMaskapai(String mskp){
        m.setMaskapai(mskp);
    }
    public String getMaskapai(){
        return m.getMaskapai();
    }
    public void setTujuan(String tjn){
        m.setTujuan(tjn);
    }
    public String getTujuan(){
        return m.getTujuan();
    }
    public void setJam(String jm){
        m.setJam(jm);
    }
    public String getJam(){
        return m.getJam();
    }
    public int getHarga(){
        return m.getHargatiket();
    }
    public int getBiaya(){
        return m.getBiaya();
    }

    public int getPotongan(){
        return m.getPotongan();
    }
    public int getKodePromo(){
        return m.getKodePromo();
    }
    public void HitungHarga(){
        m.HitungHarga();
    }
    public void validasiPromo(String kode){
        m.validasiPromo(kode);
    }
    public String tampilkanHarga(){
        return m.getTampilHarga();
    }


}
