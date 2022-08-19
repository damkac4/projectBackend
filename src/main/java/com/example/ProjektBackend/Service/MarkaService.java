package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Repository.MarkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkaService {

    private final MarkaRepository markaRepository;

    @Autowired
    public MarkaService(MarkaRepository markaRepository) {
        this.markaRepository = markaRepository;
    }

    public List<Marka> getAll(){

        return markaRepository.findAll();

    }


}
