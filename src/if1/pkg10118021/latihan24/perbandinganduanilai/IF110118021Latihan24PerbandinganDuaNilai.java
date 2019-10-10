/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan24.perbandinganduanilai;

import java.util.Scanner;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Perbandingan dua buah Nilai
 */
public class IF110118021Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String status = "Ya";
        Scanner input = new Scanner(System.in);
        System.out.println("Program Perbandingan Nilai");
        do{
            System.out.print("Masukkan nilai pertama : ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            int nilai2 = input.nextInt();
            System.out.println("Hasil : " + nilai1 + ((nilai1 < nilai2) ? 
                    " Lebih kecil " : ((nilai1 == nilai2) ? " sama dengan" : 
                            " Lebih besar ")) + nilai2 );
            System.out.print("Ulangi aktivitas? [Ya/Tidak] : ");
            status = input.next();
        }while(status.equals("Ya") || status.equals("ya"));
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
