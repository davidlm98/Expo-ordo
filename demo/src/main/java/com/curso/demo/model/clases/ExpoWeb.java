package com.curso.demo.model.clases;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExpoWeb {
    @Id
    private String numeroDeExpo;
    private String direccion;
    private String telefono;


    public ExpoWeb(String numeroDeExpo, String direccion, String telefono) {
        this.numeroDeExpo = numeroDeExpo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public ExpoWeb (){

    }

    public String getNumeroDeExpo() {
        return numeroDeExpo;
    }

    public void setNumeroDeExpo(String numeroDeExpo) {
        this.numeroDeExpo = numeroDeExpo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
