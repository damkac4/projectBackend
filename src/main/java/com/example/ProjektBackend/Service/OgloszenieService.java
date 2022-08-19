package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Repository.OgloszenieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OgloszenieService {

    private final OgloszenieRepository ogloszenieRepository;

    @Autowired
    public OgloszenieService(OgloszenieRepository ogloszenieRepository) {
        this.ogloszenieRepository = ogloszenieRepository;

    }

    public List<Ogloszenie> getAll(){

       return ogloszenieRepository.findAll();

    }



}
