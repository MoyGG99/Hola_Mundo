package com.example.web;

import com.example.dao.IndividuoDAO;
import com.example.domine.Individuo;
import com.example.servicio.IndividuoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Component
public class ControladorRest {

    @Autowired
   private IndividuoServicio individuoServicio;
    @GetMapping("/")
    public String comienzo(Model model){
        List<Individuo> individuos = individuoServicio.individuos();
        model.addAttribute("individuos", individuos);
        return "indice";
    }

    @GetMapping("/anexar")
    public String anexar(Individuo individuo){
        return "cambiar";
    }

    @PostMapping("/salvar")
    public String salvar(Individuo individuo){
        individuoServicio.salvar(individuo);
        return "redirect/";
    }

}
