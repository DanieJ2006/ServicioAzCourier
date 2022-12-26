package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Remitente;

@Repository
public interface RemitenteRepository extends JpaRepository<Remitente, Integer>{

}
