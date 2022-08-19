package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Service.OgloszenieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OgloszenieController {

    private OgloszenieService ogloszenieService;

    @Autowired
    public OgloszenieController(OgloszenieService ogloszenieService) {
        this.ogloszenieService = ogloszenieService;
    }

    @GetMapping(path = "/s")
    public List<Ogloszenie> signUp()  {
        return ogloszenieService.getAll();
    }
}
