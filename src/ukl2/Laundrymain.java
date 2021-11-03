/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

/**
 *
 * @author ilham
 */
public class Laundrymain {
    public static void main(String[] args) {
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();

        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(daftarJenisLaundry);
        System.out.println();//jarak
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        System.out.println();//jarak
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        
    }
}