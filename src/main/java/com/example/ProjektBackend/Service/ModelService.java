package com.example.ProjektBackend.Service;

import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Model;
import com.example.ProjektBackend.Repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    @Autowired
    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public ArrayList<Model> getAll(ArrayList<Marka>list){

        ArrayList<Integer> ids = new ArrayList<Integer>();

        for(int i = 0; i<list.size();i++)
        {
            ids.add(Math.toIntExact(list.get(i).getId()));
        }

        return modelRepository.getAll(ids);

    }
}
