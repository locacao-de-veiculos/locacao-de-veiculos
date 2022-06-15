package com.example.crudUsuarios.controller;

import java.util.List;


import com.example.crudUsuarios.model.Veiculos;

import com.example.crudUsuarios.repository.VeiculosRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
@RequestMapping(value="/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosRepo veiculosRepo;

    @GetMapping
	public List<Veiculos> findAll(){
		return veiculosRepo.findAll();
	}

    @PostMapping
    public Veiculos save(@RequestBody Veiculos novoVeiculo){
        return veiculosRepo.save(novoVeiculo);
    }

    @PutMapping
    public Veiculos update(@RequestBody Veiculos veiculoAtualizar){
        return veiculosRepo.save(veiculoAtualizar);
    }

    @DeleteMapping
    public String delete(@RequestBody Veiculos veiculoDeletar){
        veiculosRepo.delete(veiculoDeletar);
        return "veiculo deletado com sucesso!";
    }




}

