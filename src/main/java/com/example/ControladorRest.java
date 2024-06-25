package com.example;

import com.example.domine.Individuo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

        Individuo individuo2 = new Individuo();
        individuo2.setNombre("Petra");
        individuo2.setApellido("Garcia");
        individuo2.setEdad("63");
        individuo2.setCorreo("petra@gmail.com");
        individuo2.setTelefono("7671013240");

        List<Individuo> individuos = new ArrayList<>();
        individuos.add(individuo);
        individuos.add(individuo2);

        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("individuo", individuo);
        model.addAttribute("individuos", individuos);
        return "indice";
    }

}
