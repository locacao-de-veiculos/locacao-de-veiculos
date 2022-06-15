package com.example.crudUsuarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculos {
    private Long id;
    private String placa;
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    private String cor;
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    private String modelo;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int km;
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    private String veiculoLoja;

    public String getVeiculoLoja() {
        return veiculoLoja;
    }

    public void setVeiculoLoja(String veiculoLoja) {
        this.veiculoLoja = veiculoLoja;
    }
    
    public Veiculos() {
    }

    public Veiculos (Long id, String placa, String cor, String modelo, int km, String veiculoLoja) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.km = km;
        this.veiculoLoja = veiculoLoja;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
