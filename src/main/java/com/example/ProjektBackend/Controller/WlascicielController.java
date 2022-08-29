package com.example.ProjektBackend.Controller;

import com.example.ProjektBackend.Model.BodyForm;
import com.example.ProjektBackend.Model.Ogloszenie;
import com.example.ProjektBackend.Model.Wlasciciel;
import com.example.ProjektBackend.Service.OgloszenieService;
import com.example.ProjektBackend.Service.WlascicielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WlascicielController {

    private WlascicielService wlascicielService;

    @Autowired
    public WlascicielController(WlascicielService wlascicielService) {
        this.wlascicielService = wlascicielService;
    }

    @PostMapping(path = "/saveW")
    public Long saveW(@RequestBody Wlasciciel wlasciciel)  {
        return wlascicielService.save(wlasciciel);
    }

}
