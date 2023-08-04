* @author Nabillah Rachelia M-22104410050
 */
public class Pilihan {
    public static void main(String[] args) {
        int a=100;
        int b=25;
        int hasil;
        
        System.out.println("Menu Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        
        String input = JOptionPane.showInputDialog("Masukkan Pilihan Anda = ");
        int Pilihan = Integer.parseInt(input);
        switch (Pilihan) {
            case 1 -> {
                hasil = a+b;
                System.out.println("Penjumlahan "+a+" + "+b+" adalah "+hasil);
            }
            case 2 -> {
                hasil = a-b;
                System.out.println("Pengurangan "+a+" - "+b+" adalah "+hasil);
            }
            default -> System.out.println("Anda salah memilih");
        }
        
    }
}
