package TiketPesawat;

/**
 *
 * @author FARREL ANDHIKA RIZKY PUTRA - 24060120130071
 */
public class Model{

    private String Maskapai,Tujuan,Jam,tampilHarga;
    private int biaya,hargatiket;
    private int potongan = 0;
    private int kodeprom = 0;
    public void setMaskapai(String mskp){
        this.Maskapai = mskp;
    }
    public String getMaskapai(){
        return Maskapai;
    }
    public void setTujuan(String tjn){
        this.Tujuan = tjn;
    }
    public String getTujuan(){
        return Tujuan;
    }
    public void setJam(String jm){
        this.Jam = jm;
    }
    public String getJam(){
        return Jam;
    }
    public int getHargatiket(){
        return hargatiket;
    }

    public int getBiaya(){
        return biaya;
    }

    public int getPotongan(){
        return potongan;
    }
    public int getKodePromo(){
        return kodeprom;
    }
    public String getTampilHarga(){
        return tampilHarga;
    }
    public void HitungHarga(){
        if((Maskapai== "Pilih Maskapai")||(Tujuan == "Pilih Tujuan")||(Jam == "not selected")){
            tampilHarga = "";
        }
        else if(Maskapai == "Lion Air"){
            if(Tujuan == "Jakarta"){
                if (Jam == "06:00"){
                    hargatiket=750000;
                    tampilHarga = ("Rp750.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=800000;
                    tampilHarga = ("Rp800.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=850000;
                    tampilHarga = ("Rp850.000");
                }
            }
            else if(Tujuan == "Surabaya"){
                if (Jam == "06:00"){
                    hargatiket=950000;
                    tampilHarga = ("Rp950.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1000000;
                    tampilHarga = ("Rp1.000.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1050000;
                    tampilHarga = ("Rp1.050.000");
                }
            }
            else if(Tujuan == "Bali"){
                if (Jam == "06:00"){
                    hargatiket=1050000;
                    tampilHarga = ("Rp1.050.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1100000;
                    tampilHarga = ("Rp1.100.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1150000;
                    tampilHarga = ("Rp1.150.000");
                }
            }
        }
        else if(Maskapai == "Garuda"){
            if(Tujuan == "Jakarta"){
                if (Jam == "06:00"){
                    hargatiket=1000000;
                    tampilHarga = ("Rp1.000.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1100000;
                    tampilHarga = ("Rp1.100.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1200000;
                    tampilHarga = ("Rp1.200.000");
                }
            }
            else if(Tujuan == "Surabaya"){
                if (Jam == "06:00"){
                    hargatiket=1300000;
                    tampilHarga = ("Rp1.300.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1400000;
                    tampilHarga = ("Rp1.400.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1500000;
                    tampilHarga = ("Rp1.500.000");
                }
            }
            else if(Tujuan == "Bali"){
                if (Jam == "06:00"){
                    hargatiket=1500000;
                    tampilHarga = ("Rp1.500.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1600000;
                    tampilHarga = ("Rp1.600.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1700000;
                    tampilHarga = ("Rp1.700.000");
                }
            }
        }
        else if(Maskapai == "Air Asia"){
            if(Tujuan == "Jakarta"){
                if (Jam == "06:00"){
                    hargatiket=900000;
                    tampilHarga = ("Rp900.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=950000;
                    tampilHarga = ("Rp950.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1100000;
                    tampilHarga = ("Rp1.000.000");
                }
            }
            else if(Tujuan == "Surabaya"){
                if (Jam == "06:00"){
                    hargatiket=1150000;
                    tampilHarga = ("Rp1.150.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1200000;
                    tampilHarga = ("Rp1.200.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1250000;
                    tampilHarga = ("Rp1.250.000");
                }
            }
            else if(Tujuan == "Bali"){
                if (Jam == "06:00"){
                    hargatiket=1350000;
                    tampilHarga = ("Rp1.350.000");
                }
                else if(Jam == "12:00"){
                    hargatiket=1400000;
                    tampilHarga = ("Rp1.400.000");
                }
                else if(Jam == "18:00"){
                    hargatiket=1450000;
                    tampilHarga = ("Rp1.450.000");
                }
            }
        }
        biaya = hargatiket;
        kodeprom=0;
        potongan=0;
    }
    public void validasiPromo(String kode){
        switch (kode) {
            case "10PERSEN":
                potongan = hargatiket * 10/100;
                biaya = hargatiket - potongan;
                kodeprom = 1;
                break;
            case "20PERSEN":
                potongan = hargatiket * 20/100;
                biaya = hargatiket - potongan;
                kodeprom = 1;
                break;
            case "30PERSEN":
                potongan = hargatiket * 30/100;
                biaya = hargatiket - potongan;
                kodeprom = 1;
                break;
            case "40PERSEN":
                potongan = hargatiket * 40/100;
                biaya = hargatiket - potongan;
                kodeprom = 1;
                break;
            default:
                biaya = hargatiket;
                break;
        }
    }
}
