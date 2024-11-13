/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acticity2_51421573;

/**
 *
 * @author 62821
 */
public class Acticity2_51421573 {

    public static void main(String[] args) {
        //untuk membuat objek pada class mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Laahiq", "51421573", 22);
        mahasiswa.tampilkanData();
        System.out.println();
        
        //untuk membuat objek pada class mahasiswasarjana
        MahasiswaSarjana mahasiswaSarjana = new MahasiswaSarjana ("Gilang", "50421564", 21, "Informatika");
        mahasiswaSarjana.tampilkanData();
    }
}
