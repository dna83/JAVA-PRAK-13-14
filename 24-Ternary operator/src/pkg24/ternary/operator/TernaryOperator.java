/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24.ternary.operator;

/**
 * Nama : Dani Nugraha
 * NIM  : A2.1900035
 * Kelas: TI-1C
 */
import java.util.*;
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ternary operator

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);
        System.out.println("hasilnya " + x);
    }
}
