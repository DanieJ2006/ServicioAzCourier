package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Integer>{

}
