package com.master.formacion.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.master.formacion.model.Curso;
import com.master.formacion.model.Formacion;

@RestController
public class FormacionServiceImpl implements FormacionService {

    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/";

    @Override
    public List<Formacion> formacion() {
        List<Formacion> formaciones = new ArrayList<>();
        List<Curso> cursos = Arrays.asList(template.getForObject(url, Curso[].class));
        for (Curso curso : cursos) {
            formaciones.add(transformarCursoAFormacion(curso));
        }
        return formaciones;
    }

    @Override
    public void altaFormacion(Formacion formacion) {
        boolean cursoExiste = false;
        List<Curso> cursos = Arrays.asList(template.getForObject(url, Curso[].class));
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(formacion.getCurso())){
                cursoExiste = true; 
            }     
        }
        if (!cursoExiste) {
                Curso curso = new Curso(0, formacion.getCurso(),formacion.getAsignaturas()*10, formacion.getPrecio());
                template.postForLocation(url, curso);
            }
    }

    public Formacion transformarCursoAFormacion(Curso curso){
        Formacion formacion = new Formacion();
            if (curso.getDuracion() >= 50){
                formacion.setAsignaturas(10);
            } else {
                formacion.setAsignaturas(5);
            }
            formacion.setCurso(curso.getNombre());
            formacion.setPrecio(curso.getPrecio());
            return formacion;
    }
    
}
