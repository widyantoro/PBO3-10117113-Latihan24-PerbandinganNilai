/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan24.perbandingannilai;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk melihat perbandingan dua buah bilangan
 */
public class PBO310117113Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiSatu,nilaiDua;
        String ulang;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("=====PROGRAM PERBANDINGAN NILAI=====");
        System.out.println("");
        
        do{
            System.out.print("Masukan Nilai Pertama : ");
            nilaiSatu = scanner.nextInt();
            
            System.out.print("Masukan Nilai Kedua : ");
            nilaiDua = scanner.nextInt();
            
            if(nilaiSatu < nilaiDua){
                System.out.print("Hasil : "+nilaiSatu+" Lebih Kecil Dari "
                                 +nilaiDua);
            }
            else if (nilaiSatu > nilaiDua){
                System.out.print("Hasil : "+nilaiSatu+" Lebih Besar Dari "
                                  +nilaiDua);
            }
            else
                System.out.print("Hasil : "+nilaiSatu+" Sama Dengan "
                                 +nilaiDua);
            System.out.println("");
            System.out.print("Ulangi Aktivasi ? [YA/TIDAK] : ");
            ulang = scanner.next();
            System.out.println("");
        }
        while(!ulang.equals("TIDAK"));
    }
    
}
