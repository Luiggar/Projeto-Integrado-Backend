package com.proj.projetointegrado.services;

import com.proj.projetointegrado.entity.EntiFornecedor;
import com.proj.projetointegrado.entity.EntiProduto;
import com.proj.projetointegrado.model.Fornecedor;
import com.proj.projetointegrado.model.FornecedorMapper;
import com.proj.projetointegrado.model.Produto;
import com.proj.projetointegrado.model.ProdutoMapper;
import com.proj.projetointegrado.repository.RepoFornecedor;
import com.proj.projetointegrado.repository.RepoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServFornecedorImpl implements ServFornecedor{

    @Autowired
    RepoFornecedor repoFornecedor;

    @Autowired
    RepoProduto repoProduto;

    @Override
    public List<Fornecedor> getAllFornecedor() {
        List<EntiFornecedor> entiFornecedor = repoFornecedor.findAll(Sort.by("nome"));
        return FornecedorMapper.INSTANCE.listFEnti(entiFornecedor);
    }

    @Override
    public Fornecedor getFornecedor(Long id) {
       Fornecedor fornecedor = FornecedorMapper.INSTANCE.fromEnti(repoFornecedor.findById(id).get());
        return fornecedor;
    }

    @Override
    public Fornecedor addFornecedor(Fornecedor fornecedor) {
        EntiFornecedor entiFornecedor = FornecedorMapper.INSTANCE.toEnti(fornecedor);
        repoFornecedor.save(entiFornecedor);
        return fornecedor;
    }

    @Override
    public List<Produto> findProOfFor(Fornecedor fornecedor) {
        List<EntiProduto> entiprodutosList = repoProduto.findAllByFornecedorIdfornecedor(fornecedor.getIdfornecedor());
        List<Produto> produtosList = ProdutoMapper.INSTANCE.listFromEnti(entiprodutosList);
        return produtosList;
    }

    @Override
    public Fornecedor updateFor(Long id, Fornecedor fornecedor) {
        EntiFornecedor entiFornecedor = FornecedorMapper.INSTANCE.toEnti(fornecedor);
        repoFornecedor.save(entiFornecedor);
        return fornecedor;
    }


}
