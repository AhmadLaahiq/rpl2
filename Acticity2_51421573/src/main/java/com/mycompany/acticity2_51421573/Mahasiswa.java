/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.acticity2_51421573;

/**
 *
 * @author 62821
 */
public class Mahasiswa {
    //membuat variable menjadi private atau harus melewati class ini
    private String nama;
    private String npm;
    private int umur;
    
    //membuat variabel nama, npm, umur
    public Mahasiswa(String nama, String npm, int umur) { 
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }
    
    //untuk menampilkan variabel nama, npm, umur
    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Umur: " + umur);
    }
}
