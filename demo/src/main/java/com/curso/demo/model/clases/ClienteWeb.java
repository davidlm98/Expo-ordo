package com.curso.demo.model.clases;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity //significa que se tiene que grabar
public class ClienteWeb {
    @NotEmpty (message = "El nombre no puede ser nulo")
    private String name;
    private String direccion;
    private String dni;
    @Id
    private int telefono;

    public ClienteWeb(String name, String direccion, String dni, int telefono) {
        this.name = name;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    public ClienteWeb() {
        this.name = name;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }


    public String getName() {
        return name;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public void addCliente(){
        new ClienteWeb(getName(), getDireccion(), getDni(), getTelefono());
    }
}
