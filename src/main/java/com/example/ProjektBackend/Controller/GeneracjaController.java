package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Generacja;
import com.example.ProjektBackend.Model.Model;
import com.example.ProjektBackend.Service.GeneracjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GeneracjaController {

    GeneracjaService generacjaService;

    @Autowired
    public GeneracjaController(GeneracjaService generacjaService) {
        this.generacjaService = generacjaService;
    }


    @PostMapping(path = "/g")
    public List<Generacja> signUp(@RequestBody ArrayList<Model> list)  {
        return generacjaService.getAll(list);
    }
}
