package com.example.dao;

import com.example.domine.Individuo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;


@Component
public interface IndividuoDAO extends CrudRepository<Individuo, Long> {


}
