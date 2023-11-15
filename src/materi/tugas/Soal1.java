/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materi.tugas;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int digit, bill;
        System.out.println("Inputkan berapa digit bilangan (maksikal 4 digit) = ");
        digit = input.nextInt();
        bill = 0;
        if(digit > 0 && digit < 5){
            for(int i = 0; i<digit; i++){
                System.out.println("Inputkan bilangan ke-"+(i+1));
                bill += input.nextInt();
                
            }
            System.out.println("jumlah bilangan = "+bill);
        }else {
            System.out.println("bilangan tidak valid");
        }

    }
    
}
