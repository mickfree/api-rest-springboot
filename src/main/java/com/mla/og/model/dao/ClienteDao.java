package com.mla.og.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.mla.og.model.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,Integer> {

}
