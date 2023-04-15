package fr.librairie.septArche.controller;


import fr.librairie.septArche.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/livres")

public class LivreController {
    @Autowired
    private Livre livre;



    @GetMapping("/search")
    public List<Livre> TrouveList() {

        return  livre.getAll();
    }



}
