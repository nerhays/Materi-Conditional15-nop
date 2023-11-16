/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi.tugas;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int bil, banyak, a, digit, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Bilangan Bulat Positif = ");
        bil = input.nextInt();
        banyak = 0;
        digit = 0;
        b = 1;
        if (bil >= 100000 && bil <= 999999) {
            for (int i = 1; i <= 6; i++) {
                //a = bil % 10;
                a = (bil/b)%10;
                if (a % 2 == 0) {                    
                    banyak++;
                    System.out.print(a);
                }else {
                }
                //bil /= 10;
                b *= 10;
            }
            System.out.println("");
            //System.out.println(digit);
            System.out.println("banyaknya bilangan genap = "+banyak);
        }else{
            System.out.println("Angka harus 6 digit");
        }
        
    }
}
