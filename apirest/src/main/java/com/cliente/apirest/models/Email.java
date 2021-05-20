package com.cliente.apirest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EMAIL")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition ="ID")
    private Long id;

    @Column(columnDefinition ="EMAIL")
    private String email;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(columnDefinition ="CLIENTE")
    private Cliente cliente;


//    Metodos de acesso Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
