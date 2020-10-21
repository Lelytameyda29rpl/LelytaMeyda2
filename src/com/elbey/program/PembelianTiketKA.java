/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elbey.program;

/**
 *
 * @author MOKLET-2
 */
import java.util.Scanner;
public class PembelianTiketKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Pilihan,JumlahTiket,Harga;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("TEMPAT PEMBELIAN TIKET KERETA API");
        System.out.println("--------------------------");
        System.out.println("Daftar Harga Tiket Kereta Api");
        
        System.out.println("No.NAMA KERETA DAN TUJUAN HARGA TIKET");
        System.out.println("1.MATARMAJA 292 PASAR SENEN KE NGUNUT Rp.150.000");
        System.out.println("2.KAHURIPAN 293 TULUNGAGUNG KE KERTOSONO Rp.80.000");
        System.out.println("3.KAHURIPAN 294 TASIKMALAYA KE TULUNGAGUNG Rp.84.000");
        System.out.println("----------------------------------------------------");
        
        System.out.println("Melakukan Pembelian Tiket Kereta Api");
        System.out.println("Masukkan No.Tiket Yang Ingin Anda Dapatkan:");
        Pilihan = scan.nextInt();
        switch(Pilihan){
            case 1:
                System.out.println("Tiket Anda MATARMAJA 292 PASAR SENEN KE NGUNUT Rp.150.000");
                System.out.print("Masukkan Jumlah Tiket Yang Ingin Anda Dapatkan:");
                JumlahTiket = scan.nextInt();
                Harga = 150000*JumlahTiket;
                System.out.println("Harga = Rp. "+Harga);
                System.out.println("Total Pembayaran Rp. "+ Harga +" untuk "+ JumlahTiket +" Tiket ");
            break;
            case 2:
                System.out.println("Tiket Anda KAHURIPAN 293 TULUNGAGUNG KE KERTOSONO Rp.80.000");
                System.out.println("Masukkan Jumlah Tiket Yang Ingin Anda Dapatkan:");
                JumlahTiket = scan.nextInt();
                Harga = 80000*JumlahTiket;
                System.out.println("Harga = Rp. "+Harga);
                System.out.println("Total Pembayaran Rp. "+ Harga +" untuk "+ JumlahTiket +" Tiket ");
            break;
            case 3:
                System.out.println("Tiket Anda KAHURIPAN 294 TASIKMALAYA KE TULUNGAGUNG Rp.84.000");
                System.out.println("Masukkan Jumlah Tiket Yang Ingin Anda Dapatkan:");
                JumlahTiket = scan.nextInt();
                Harga = 84000*JumlahTiket;
                System.out.println("Harga = Rp. "+Harga);
                System.out.println("Total Pembayaran Rp. "+ Harga +" untuk "+ JumlahTiket +" Tiket ");
            break;
                
                
                
                
        }
        
        
        
    }
        
    }
    

