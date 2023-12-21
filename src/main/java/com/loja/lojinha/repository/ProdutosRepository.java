package com.loja.lojinha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.lojinha.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    
}
