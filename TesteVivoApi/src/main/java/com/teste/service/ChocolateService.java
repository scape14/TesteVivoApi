package com.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.entity.Chocolate;
import com.teste.repository.ChocolateRepository;

@Service
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public double calcularCacauNecessario(String tipoChocolate) throws Exception {
        Chocolate chocolate = chocolateRepository.findByTipo(tipoChocolate);
        if (chocolate != null) {
            return chocolate.getQtdCacau(); 
        }
        throw new Exception("Chocolate não encontrado: " + tipoChocolate);
    }
}