/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.latihan.loop.sederhana;

import java.util.Scanner;

/**
 * Nama : Tubagus Firmansyah Hidayat
 * NIM  : A2.1900182
 * Kelas: TI-1C
 */
public class LatihanLoopSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();


        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
