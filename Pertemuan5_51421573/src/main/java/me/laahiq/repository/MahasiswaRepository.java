/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.laahiq.repository;
import me.laahiq.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 62821
 */

@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    
    
}
