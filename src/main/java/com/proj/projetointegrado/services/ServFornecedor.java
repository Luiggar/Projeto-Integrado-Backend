package com.proj.projetointegrado.services;

import com.proj.projetointegrado.model.Fornecedor;
import com.proj.projetointegrado.model.Produto;

import java.util.List;

public interface ServFornecedor {

    List<Fornecedor> getAllFornecedor();

    Fornecedor getFornecedor(Long id);

    Fornecedor addFornecedor(Fornecedor fornecedor);

    List<Produto> findProOfFor(Fornecedor fornecedor);

    Fornecedor updateFor(Long id,Fornecedor fornecedor);
}
