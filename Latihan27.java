/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan27;

/**
 *
 * @author gianp
 * NAMA     : Gian Prakoso
 * KELAS    : Sistem Informasi
 * NIM      : 23176034
 */
import java.util.Scanner;

public class Latihan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        scanner.close();
    }
}