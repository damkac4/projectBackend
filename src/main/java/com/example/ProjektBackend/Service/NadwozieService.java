package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Nadwozie;
import com.example.ProjektBackend.Repository.NadwozieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NadwozieService {

    NadwozieRepository nadwozieRepository;

    @Autowired
    public NadwozieService(NadwozieRepository nadwozieRepository) {
        this.nadwozieRepository = nadwozieRepository;
    }

    public List<Nadwozie> getAll(){

        return nadwozieRepository.findAll();

    }
}
