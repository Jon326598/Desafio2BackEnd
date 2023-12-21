package com.loja.lojinha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.lojinha.model.Produtos;
import com.loja.lojinha.model.exception.ResourceNotFoundException;
import com.loja.lojinha.repository.ProdutosRepository;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtoRepository;

    public Produtos cadastrar(Produtos produtos){
        return produtoRepository.save(produtos);
    }

    public List<Produtos> obterTodos(){
        return produtoRepository.findAll();
    }

    public Produtos obterPorId(Long id){
        Optional<Produtos> optProdutos = produtoRepository.findById(id);
    
        if(optProdutos.isEmpty()){
            throw new ResourceNotFoundException("Não existe nenhum produtos com o ID " + id);  
        }
    
        return optProdutos.get();
    }

    public Produtos atualizar(Long id, Produtos produtos){

        produtos.setId(id);
        return produtoRepository.save(produtos);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);

    }

}
