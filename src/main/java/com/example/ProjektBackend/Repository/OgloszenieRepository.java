package com.example.ProjektBackend.Repository;

import com.example.ProjektBackend.Model.Ogloszenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OgloszenieRepository extends JpaRepository<Ogloszenie, Long> {
//    @Query(value = "")
//    ArrayList<String> getAll();
}
