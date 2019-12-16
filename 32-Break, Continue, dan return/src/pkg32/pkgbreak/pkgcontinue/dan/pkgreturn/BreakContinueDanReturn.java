/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg32.pkgbreak.pkgcontinue.dan.pkgreturn;

/**
 * Nama : Dani Nugraha
 * NIM  : A2.1900035
 * Kelas: TI-1C
 */
public class BreakContinueDanReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // break, continue, dan return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal
            } else if (a == 7){
                return;
            }

            System.out.println("looping ke - " + a);

        }

        System.out.println("akhir dari looping");
    }
}
