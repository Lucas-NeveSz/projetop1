package com.example.projetop1.service;

import com.example.projetop1.entity.Estado;

import com.example.projetop1.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscartodos(){
        return estadoRepository.findAll();
    }
}
