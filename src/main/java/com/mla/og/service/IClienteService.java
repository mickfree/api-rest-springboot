package com.mla.og.service;

import com.mla.og.model.entity.Cliente;
import com.mla.og.model.dto.ClienteDto;

import java.util.List;

public interface IClienteService {

    List<Cliente> listAll();

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existsById(Integer id);



}
