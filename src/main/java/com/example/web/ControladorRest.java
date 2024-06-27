package com.example.web;

import com.example.dao.IndividuoDAO;
import com.example.domine.Individuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControladorRest {

    @Autowired
    private IndividuoDAO individuoDAO;
    @GetMapping("/")
    public String comienzo(Model model){
        Iterable<Individuo> individuos = individuoDAO.findAll();
        model.addAttribute("individuos", individuos);
        return "indice";
    }

}
