/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg34.fungsi.atau.method.pengenalan;

/**
 * Nama : Dani Nugraha
 * NIM  : A2.1900035
 * Kelas: TI-1C
 */
public class FungsiAtauMethodPengenalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // y = (x + 2) * x
        int y,x;
        x = 5;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

    }

    public static int hitung(int input){
        int hasil;
        hasil = input * input;

        return hasil;
    }
}
