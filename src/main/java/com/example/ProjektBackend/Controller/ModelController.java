package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Model;
import com.example.ProjektBackend.Service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }


    @PostMapping(path = "/m")
    public List<Model> signUp(@RequestBody ArrayList<Marka> list)  {
        return modelService.getAll(list);
    }
}
