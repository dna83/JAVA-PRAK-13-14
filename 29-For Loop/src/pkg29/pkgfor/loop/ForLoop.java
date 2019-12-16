/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29.pkgfor.loop;

/**
 * Nama : Dani Nugraha
 * NIM  : A2.1900035
 * Kelas: TI-1C
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ini adalah awal program");

        System.out.println("loop pertama");

        for(int nilai = 0; nilai <= 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }


        System.out.println("loop kedua");

        for(int nilai = 0; nilai < 10 ; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga");

        for(int nilai = 10; nilai >= 5 ; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop keempat");

        int nilai = 0;

        for(; nilai < 10 ;){

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("ini adalah akhir program");
    }
}
