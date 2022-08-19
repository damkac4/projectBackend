package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Service.MarkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MarkaController {

    private MarkaService markaService;

    @Autowired
    public MarkaController(MarkaService markaService) {
        this.markaService = markaService;
    }

    @GetMapping(path = "/mr")
    public List<Marka> signUp()  {
        return markaService.getAll();
    }

}
