package com.example.ProjektBackend.Repository;


import com.example.ProjektBackend.Model.Nadwozie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NadwozieRepository extends JpaRepository<Nadwozie, Long> {



}
