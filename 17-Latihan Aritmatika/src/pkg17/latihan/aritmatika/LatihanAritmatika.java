/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.latihan.aritmatika;

/**
 * Nama : Tubagus Firmansyah Hidayat
 * NIM  : A2.1900182
 * Kelas: TI-1C
 */
import java.util.Scanner;
public class LatihanAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
}
