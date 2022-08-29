package com.example.ProjektBackend.Repository;


import com.example.ProjektBackend.Model.Wlasciciel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WlascicielRepository extends JpaRepository<Wlasciciel, Long> {


}
