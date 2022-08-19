package com.example.ProjektBackend.Repository;

import com.example.ProjektBackend.Model.Generacja;
import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface GeneracjaRepository extends JpaRepository<Generacja, Long> {

    @Query(value = "Select * from Generacja where model_id in ?1  ",nativeQuery = true)
    ArrayList<Generacja> getAll(ArrayList<Integer>list);
}
