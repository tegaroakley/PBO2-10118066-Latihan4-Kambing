/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan4.kambing;

/**
 *
 * @author 
 * NAMA : Tegar Lucky'Q Oakley 
 * NIM : 10118066 
 * KELAS : IF2 
 * Deskripsi Program : Program ini berisi program untuk Menjumlahkan Kambing
 */
public class Kambing {

    public void tambahKambing() {
        //Deklarasi Variabel Lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
