package com.curso.demo.repositories;

import com.curso.demo.model.clases.ClienteWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.BitSet;
import java.util.List;
import java.util.Optional;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteWeb, Integer> {
    //public  findByIdAndName(Integer id, String name);

    public Optional<List<ClienteWeb>>findByName(String name);
    //public Optional<List<Cliente1>>findByNameOrderByDirection(String name);
    //obtener por nombre ordenado por direccion

    public Optional<List<ClienteWeb>>findByNameAndDireccion(String name, String direccion);

    BitSet findByNombre(String nombre);
    // public Optional<List<Cliente1>>findTop1ByNameAndDireccion(String name, String direccion); te sale el top 1
    // esto se usa para ser mas eficiente y no te muestre todos los resultados
}
