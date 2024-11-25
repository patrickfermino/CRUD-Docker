package com.example.CRUD_Docker.service;

import com.example.CRUD_Docker.model.Endereco;
import com.example.CRUD_Docker.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired

    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco entity){
        return enderecoRepository.save(entity);
    }
    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

}
