package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Model.Paliwo;
import com.example.ProjektBackend.Service.PaliwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PaliwoController {

    PaliwoService paliwoService;

    @Autowired
    public PaliwoController(PaliwoService paliwoService) {
        this.paliwoService = paliwoService;
    }

    @GetMapping(path = "/p")
    public List<Paliwo> signUp()  {
        return paliwoService.getAll();
    }
}
