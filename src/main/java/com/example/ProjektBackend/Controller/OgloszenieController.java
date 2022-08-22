package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.BodyForm;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Service.OgloszenieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class OgloszenieController {

    private OgloszenieService ogloszenieService;

    @Autowired
    public OgloszenieController(OgloszenieService ogloszenieService) {
        this.ogloszenieService = ogloszenieService;
    }

    @PostMapping(path = "/s")
    public List<Ogloszenie> getAll(@RequestBody BodyForm bodyForm)  {
        return ogloszenieService.getAll(bodyForm);
    }

    @PostMapping(path = "/sid")
    public Optional<Ogloszenie> findById(@RequestParam Long id)  {
        System.out.println(id);
        return ogloszenieService.findById(id);
    }

}
