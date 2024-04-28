package com.mla.og.service.impl;

import com.mla.og.model.dao.ClienteDao;
import com.mla.og.model.entity.Cliente;
import com.mla.og.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mla.og.model.dto.ClienteDto;

import java.util.List;

@Service
public class ClienteImplementsService implements IClienteService {
    @Autowired
    private ClienteDao clienteDao;


    @Override
    public List<Cliente> listAll() {
        return (List) clienteDao.findAll();
    }

    @Transactional
    @Override
    public Cliente save(ClienteDto ClienteDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(ClienteDto.getIdCliente())
                .nombre(ClienteDto.getNombre())
                .apellido(ClienteDto.getApellido())
                .correo(ClienteDto.getCorreo())
                .fechaRegistro(ClienteDto.getFechaRegistro())
                .build();
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
        public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public boolean existsById(Integer id){
        return clienteDao.existsById(id);
    }
}
