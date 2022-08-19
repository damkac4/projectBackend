package com.example.ProjektBackend.Repository;

import com.example.ProjektBackend.Model.Paliwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PaliwoRepository extends JpaRepository<Paliwo, Long> {


}
