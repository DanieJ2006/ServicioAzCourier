package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Repartidor;

@Repository
public interface RepartidorRepository extends JpaRepository<Repartidor, Integer> {

}
