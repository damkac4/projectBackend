package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Generacja;
import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Model;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Repository.GeneracjaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeneracjaService {

    GeneracjaRepository generacjaRepository;

    public GeneracjaService(GeneracjaRepository generacjaRepository) {
        this.generacjaRepository = generacjaRepository;
    }

    public List<Generacja> getAll(ArrayList<Model> list){


        ArrayList<Integer> ids = new ArrayList<Integer>();

        for(int i = 0; i<list.size();i++)
        {
            ids.add(Math.toIntExact(list.get(i).getId()));
        }
        return generacjaRepository.getAll(ids);

    }

}
