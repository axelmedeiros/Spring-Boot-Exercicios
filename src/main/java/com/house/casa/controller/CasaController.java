package com.house.casa.controller;

import com.house.casa.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/house")
public class CasaController {

    @Autowired
    private CasaService service;

    @GetMapping
    public String get() {
        return this.service.get();
    }
}
