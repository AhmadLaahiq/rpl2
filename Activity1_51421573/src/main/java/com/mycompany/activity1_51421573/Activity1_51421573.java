/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity1_51421573;
import java.util.Scanner; //fungsi untuk membaca scanner
/**
 *
 * @author 62821
 */
public class Activity1_51421573 {

    public static void main(String[] args) {
        //scanner untuk inputan nama
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = input.nextLine();
        
        //scanner untuk inpuan npm
        System.out.println("Masukkan npm anda: ");
        String npm = input.nextLine();
        
        //scanner untuk inputan umut
        System.out.println("Masukkan umur anda: ");
        int umur = input.nextInt();
        
        System.out.println("Nama anda adalah " + nama); //untuk menampilkan output nama
        System.out.println("npma anda adalah " + npm); //untuk menampilkan output npm
        System.out.println("Umur anda adalah " + umur + " tahun"); //untuk menampilkan output umur
    }
}
