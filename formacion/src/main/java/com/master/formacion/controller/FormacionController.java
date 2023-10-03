package com.master.formacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.master.formacion.model.Formacion;
import com.master.formacion.service.FormacionService;

@RestController
public class FormacionController {
    
    @Autowired
    FormacionService service;

    @GetMapping (value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Formacion> formacion() {
        return service.formacion();
    }

    @PostMapping (value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaFormacion (@RequestBody Formacion formacion) {
        service.altaFormacion(formacion);
    }
}
