* @author Nabillah Rachelia M-22104410050
 */
    public class Smartphone implements KalkulatorPajak {
        private final String Vendor;
        private final String Tipe;
        private final double Harga;

        public Smartphone (String vendor, String tipe, double harga) {
            this.Vendor = vendor;
            this.Tipe = tipe;
            this.Harga = harga;
        }

        @Override
        public double hitungHargaSetelahPPN(double harga) {
            double Pajak;

            if (harga > 4000000 && harga <= 4500000) {
                Pajak = PAJAK;
            } else if (harga > 4500000) {
                Pajak = PAJAK;
            } else {
                Pajak = PAJAK;
            }

            return harga + (harga * PAJAK);
        }

        public String getVendor() {
            return Vendor;
        }

        public String getTipe() {
            return Tipe;
        }

        public double getHarga() {
            return Harga;
        }

        public static void main(String[] args) {
            Smartphone samsungA51 = new Smartphone("Samsung", "A 51", 5000000.00);
            Smartphone oppoReno5 = new Smartphone("Oppo", "Reno 5", 4400000.00);
            Smartphone xiaomiA1 = new Smartphone("Xiaomi", "A1", 4100000.00);

            System.out.println("Harga Samsung A 51 setelah ditambah PPN: Rp" + samsungA51.hitungHargaSetelahPPN(samsungA51.getHarga()));
            System.out.println("Harga Oppo Reno 5 setelah ditambah PPN: Rp" + oppoReno5.hitungHargaSetelahPPN(oppoReno5.getHarga()));
            System.out.println("Harga Xiaomi A1 setelah ditambah PPN: Rp" + xiaomiA1.hitungHargaSetelahPPN(xiaomiA1.getHarga()));
        }
    }
