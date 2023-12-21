package com.loja.lojinha.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.lojinha.model.Produtos;
import com.loja.lojinha.service.ProdutosService;

@RestController
@RequestMapping ("/api/produtos")
@CrossOrigin("*")
public class ProdutosController {

    @Autowired
    private ProdutosService produtoService;
    @GetMapping
    public List<Produtos> obterTodos(){
        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")    
    public Produtos obterPorId(@PathVariable Long id){
        return produtoService.obterPorId(id);
    }

    @PostMapping    
    public Produtos cadastrar(@RequestBody Produtos produtos){
        return produtoService.cadastrar(produtos);

    }

     @PutMapping("/{id}")    
    public Produtos atualizar(@PathVariable Long id, @RequestBody Produtos produtos){
        return produtoService.atualizar(id, produtos);

    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtoService.deletar(id);
    }
    
}

// http://localhost:8080/api/produtos
