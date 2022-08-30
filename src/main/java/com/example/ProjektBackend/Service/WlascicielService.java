package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Wlasciciel;
import com.example.ProjektBackend.Repository.WlascicielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WlascicielService {

    private final WlascicielRepository wlascicielRepository;

    @Autowired
    public WlascicielService(WlascicielRepository wlascicielRepository) {
        this.wlascicielRepository = wlascicielRepository;
    }




}
