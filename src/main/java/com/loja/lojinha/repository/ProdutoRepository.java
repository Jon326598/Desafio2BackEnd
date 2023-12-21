package com.loja.lojinha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.lojinha.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    
}
