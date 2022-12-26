package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Consignado;

@Repository
public interface ConsignadoRepository extends JpaRepository<Consignado, Integer>{

}
