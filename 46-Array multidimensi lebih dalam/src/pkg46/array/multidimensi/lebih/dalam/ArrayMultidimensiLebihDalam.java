/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg46.array.multidimensi.lebih.dalam;

import java.util.Arrays;

/**
 * Nama : Tubagus Firmansyah Hidayat
 * NIM  : A2.1900182
 * Kelas: TI-1C
 */
public class ArrayMultidimensiLebihDalam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array_2D = {
                {1,2,3},
                {4,5},
        };

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);

        System.out.println(Arrays.deepToString(array_2D));
        System.out.print("\n");

        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e'};

        char[][] arrayChar_2D = {
                array_char1,
                array_char2,
        };

        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }
}
