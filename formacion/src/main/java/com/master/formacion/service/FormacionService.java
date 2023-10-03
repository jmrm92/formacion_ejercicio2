package com.master.formacion.service;

import java.util.List;

import com.master.formacion.model.Formacion;

public interface FormacionService {
    
    public List<Formacion> formacion();
    public void altaFormacion(Formacion formacion);
}
