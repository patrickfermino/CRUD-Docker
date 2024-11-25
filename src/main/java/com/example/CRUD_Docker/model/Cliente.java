package com.example.CRUD_Docker.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nome;
    @Column
    private  String sobrenome;
    @Column
    private String email;
    @Column
    private  String sexo;
    @Column
    private LocalDate dataNasicmento;
    @Column
    private LocalTime dataCadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNasicmento() {
        return dataNasicmento;
    }

    public void setDataNasicmento(LocalDate dataNasicmento) {
        this.dataNasicmento = dataNasicmento;
    }

    public LocalTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNasicmento=" + dataNasicmento +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}


