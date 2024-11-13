/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acticity2_51421573;

/**
 *
 * @author 62821
 */
public class MahasiswaSarjana extends Mahasiswa { //inheritance
    //membuat variable menjadi private atau harus melewati class ini
    private String jurusan;
    
    public MahasiswaSarjana(String nama, String npm, int umur, String jurusan){
        //untuk memanggil variabel yang sudah dibuat pada class mahasiswa
        super(nama, npm, umur);
        this.jurusan = jurusan;
    }
    
    //untuk membuat polymarphism untuk membuat variabel jurusan pada output
    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Jurusan: " + jurusan);
    }
}
