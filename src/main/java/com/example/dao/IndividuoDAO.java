package com.example.dao;

import com.example.domine.Individuo;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;


public interface IndividuoDAO extends CrudRepository<Individuo, Long> {


}
