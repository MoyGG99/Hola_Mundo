package com.example.servicio;

import com.example.domine.Individuo;
import com.example.dao.IndividuoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IndividuoServicioImpl implements IndividuoServicio{

    @Autowired
    private IndividuoDAO individuoDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Individuo> individuos() {
        return (List<Individuo>) individuoDAO.findAll();
    }

    @Override
    @Transactional
    public void salvar(Individuo individuo) {
        individuoDAO.save(individuo);
    }

    @Override
    @Transactional
    public void borrar(Individuo individuo) {
        individuoDAO.delete(individuo);
    }

    @Override
    @Transactional(readOnly = true)
    public Individuo localizarIndividuo(Individuo individuo) {
        return individuoDAO.findById(individuo.getId_individuo()).orElse(null);
    }
}
