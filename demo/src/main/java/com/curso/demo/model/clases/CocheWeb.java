package com.curso.demo.model.clases;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class CocheWeb {
    @Id
    private String marca;
    private String matricula;
    private String tipoDeCoche;


    public CocheWeb(String marca, String matricula, String tipoDeCoche) {
        this.marca = marca;
        this.matricula = matricula;
        this.tipoDeCoche = tipoDeCoche;
    }
    public CocheWeb(){

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoDeCoche() {
        return tipoDeCoche;
    }

    public void setTipoDeCoche(String tipoDeCoche) {
        this.tipoDeCoche = tipoDeCoche;
    }

}
