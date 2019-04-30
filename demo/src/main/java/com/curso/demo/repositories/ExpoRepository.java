package com.curso.demo.repositories;

import com.curso.demo.model.clases.ExpoWeb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpoRepository extends JpaRepository<ExpoWeb,Integer> {
}
