package com.example;

import com.example.domine.Individuo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorRest {
    @Value("${indice.hola2}")
    private String hola2;
    @GetMapping("/")
    public String comienzo(Model model){
        String hola = "Hola mundo con spring boot";
        Individuo individuo = new Individuo();
        individuo.setNombre("Moises");
        individuo.setApellido("Garcia");
        individuo.setEdad("24");
        individuo.setCorreo("moy@gmail.com");
        individuo.setTelefono("7773029751");
        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("individuo", individuo);
        return "indice";
    }

}
