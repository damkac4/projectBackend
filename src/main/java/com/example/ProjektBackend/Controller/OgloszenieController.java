package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.BodyForm;
import com.example.ProjektBackend.Model.Marka;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Service.OgloszenieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class OgloszenieController {

    private OgloszenieService ogloszenieService;

    @Autowired
    public OgloszenieController(OgloszenieService ogloszenieService) {
        this.ogloszenieService = ogloszenieService;
    }

    @PostMapping(path = "/s")
    public List<Ogloszenie> signUp(@RequestBody BodyForm bodyForm)  {
        return ogloszenieService.getAll(bodyForm);
    }
}
