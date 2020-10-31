/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program isi saldo tabungan, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int saldoAwal = 2500000;
        
        for(i=1; i<=6; i++){
            double bunga = 0.15 * saldoAwal;
            System.out.print("Saldo di bulan ke-"+i+" Rp.");
            System.out.println(saldoAwal=(int) (saldoAwal+bunga));
        }
    }
    
}
