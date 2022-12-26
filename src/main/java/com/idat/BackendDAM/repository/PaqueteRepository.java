package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Paquete;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Integer>{

}
