package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Model.Paliwo;
import com.example.ProjektBackend.Repository.PaliwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaliwoService {

    PaliwoRepository paliwoRepository;

    @Autowired
    public PaliwoService(PaliwoRepository paliwoRepository) {
        this.paliwoRepository = paliwoRepository;
    }

    public List<Paliwo> getAll(){

        return paliwoRepository.findAll();

    }
}
