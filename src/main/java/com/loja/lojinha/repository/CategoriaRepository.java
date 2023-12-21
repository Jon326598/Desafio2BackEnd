package com.loja.lojinha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.lojinha.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    
}
