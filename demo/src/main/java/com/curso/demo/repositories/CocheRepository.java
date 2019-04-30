package com.curso.demo.repositories;

import com.curso.demo.model.clases.CocheWeb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocheRepository extends JpaRepository<CocheWeb,Integer> {
}
