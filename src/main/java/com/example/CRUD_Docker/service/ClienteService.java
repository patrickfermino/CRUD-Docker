package com.example.CRUD_Docker.service;

import com.example.CRUD_Docker.model.Cliente;
import com.example.CRUD_Docker.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

   public Cliente salvar(Cliente entity){
       return clienteRepository.save(entity);
   }

    public List<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }
    public List<Cliente> buscarPorId(){
       return clienteRepository.findAll();
    }

}
