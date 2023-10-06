package com.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.service.ChocolateService;

@RestController
@RequestMapping("/chocolates")
public class ChocolateController {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping("/{tipo}")
    public ResponseEntity<Double> calcularCacauNecessario(@PathVariable String tipo) throws Exception {
        double cacauNecessario = chocolateService.calcularCacauNecessario(tipo);
        return ResponseEntity.ok(cacauNecessario);
    }
}
