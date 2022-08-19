package com.example.ProjektBackend.Repository;

import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

    @Query(value = "Select * from Model where marka_id in ?1  ",nativeQuery = true)
    ArrayList<Model> getAll(ArrayList<Marka>list);

}
