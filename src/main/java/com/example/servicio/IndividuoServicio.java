package com.example.servicio;

import com.example.domine.Individuo;

import java.util.List;

public interface IndividuoServicio {

    public List<Individuo> individuos();

    public void salvar(Individuo individuo);

    public void borrar(Individuo individuo);

    public Individuo localizarIndividuo(Individuo individuo);
}
