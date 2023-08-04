 * @author Nabillah Rachelia M-22104410050
 */
//Handphone.java
public class Handphone implements KalkulatorPajak {
    final String vendor;
    final String tipe;
    final double harga;

    public Handphone(String vendor, String tipe, double harga){
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    
    @Override
    public double hitungHargaSetelahPPN(double harga) {
        double Pajak;
        if (harga > 4500000) {
            Pajak = 0.05; //PPN 5%
        }else if (harga > 4200000) {
            Pajak = 0.02; //PPN 2%
        }else{
            Pajak = PAJAK ; // PPN 1%
        }
        return harga + (harga * harga);
    }
    
    public String getVendor() {
        return vendor;
    }
    
    public String getTipe() {
        return tipe;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public double getTotalHargaSetelahPPN() {
        return hitungHargaSetelahPPN(harga);
    }
}