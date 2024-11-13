/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.laahiq;

import me.laahiq.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 62821
 */

@SpringBootApplication
public class Pertemuan5_51421573 implements CommandLineRunner{
    @Autowired
    private MahasiswaController mhsController;
    
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_51421573.class, args);
    }
    
    @Override
    public void run(String... args)throws Exception {
        mhsController.tampilkanMenu();
    }
}
