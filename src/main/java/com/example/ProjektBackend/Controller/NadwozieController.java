package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Nadwozie;

import com.example.ProjektBackend.Service.NadwozieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NadwozieController {

    NadwozieService nadwozieService;

    @Autowired
    public NadwozieController(NadwozieService nadwozieService) {
        this.nadwozieService = nadwozieService;
    }

    @GetMapping(path = "/n")
    public List<Nadwozie> getAll()  {
        return nadwozieService.getAll();
    }

}
