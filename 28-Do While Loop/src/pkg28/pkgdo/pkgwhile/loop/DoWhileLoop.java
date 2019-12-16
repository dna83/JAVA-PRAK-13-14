/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28.pkgdo.pkgwhile.loop;

/**
 * Nama : Dani Nugraha
 * NIM  : A2.1900035
 * Kelas: TI-1C
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
