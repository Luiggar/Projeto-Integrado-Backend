package com.proj.projetointegrado.services;

import com.proj.projetointegrado.model.Produto;

import java.util.List;

public interface ServProd {

    Produto getProduto(Long id);

    List<Produto> getAllProduto();

    Produto createProduto(Produto produto);

    Produto editEstoque(Long id,Produto produto);

    Boolean deleteProd(Long id);
}
