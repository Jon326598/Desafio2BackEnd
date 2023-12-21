package com.loja.lojinha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.lojinha.model.Categoria;
import com.loja.lojinha.model.exception.ResourceNotFoundException;
import com.loja.lojinha.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository produtoRepository;

    public Categoria cadastrar(Categoria categoria){

        return produtoRepository.save(categoria);
    }

    public List<Categoria> obterTodos(){
        return produtoRepository.findAll();
    }

    public Categoria obterPorId(Long id){
        Optional<Categoria> optCategoria = produtoRepository.findById(id);
    
        if(optCategoria.isEmpty()){
            throw new ResourceNotFoundException("Não existe nenhum categoria com o ID " + id);  
        }
    
        return optCategoria.get();
    }

    public Categoria atualizar(Long id, Categoria categoria){

        categoria.setId(id);
        return produtoRepository.save(categoria);
    }

    public void deletar(Long id) {
        produtoRepository.deleteById(id);

    }

}
