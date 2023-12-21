package com.loja.lojinha.model;

import java.util.Date;

import com.loja.lojinha.model.Enum.EUnidadeMedida;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "Id_produto")
    private long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Date dataFabricacao;

    private double valor;

    @Column(nullable = false)
    private EUnidadeMedida medida;

    private String observacao;


    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public EUnidadeMedida getMedida() {
        return medida;
    }
    public void setMedida(EUnidadeMedida medida) {
        this.medida = medida;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
