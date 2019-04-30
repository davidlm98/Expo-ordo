package com.curso.demo.model.clases;

import java.util.Collection;
import java.util.HashMap;

public class ConcesionarioWeb {
    private HashMap<Integer, ClienteWeb>listaClientes;

    public ConcesionarioWeb() {
    }

    public ClienteWeb clienteTelefono(int telefono){
        return listaClientes.get(telefono);
    }
    public ClienteWeb clienteDni(String dni){
        return listaClientes.get(dni);
    }
    public ClienteWeb getCliente(String name){
        return listaClientes.get(name);
    }

    public Collection<ClienteWeb> getClientes(){
        return listaClientes.values();
    }

}
