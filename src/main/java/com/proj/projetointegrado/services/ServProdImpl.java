package com.proj.projetointegrado.services;

import com.proj.projetointegrado.entity.EntiFornecedor;
import com.proj.projetointegrado.entity.EntiProduto;
import com.proj.projetointegrado.model.Produto;
import com.proj.projetointegrado.model.ProdutoMapper;
import com.proj.projetointegrado.repository.RepoFornecedor;
import com.proj.projetointegrado.repository.RepoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServProdImpl implements ServProd {

    @Autowired
    RepoProduto repoProduto;

    @Autowired
    RepoFornecedor repoFornecedor;

    @Override
    public Produto getProduto(Long id) {
        EntiProduto epro = repoProduto.findById(id).get();
        return ProdutoMapper.INSTANCE.fromEnti(epro);
    }

    @Override
    public List<Produto> getAllProduto() {
        List<EntiProduto> listEnti = repoProduto.findAll(Sort.by(Sort.Direction.ASC,"nomeProd"));
        return ProdutoMapper.INSTANCE.listFromEnti(listEnti);
    }

    @Override
    public Produto createProduto(Produto produto) {
        Long id = produto.getFornecedor().getIdfornecedor();
        EntiProduto entiProduto = ProdutoMapper.INSTANCE.toEnti(produto);
        EntiFornecedor entiFornecedor = repoFornecedor.findById(id).get();
        entiProduto.setFornecedor(entiFornecedor);
        repoProduto.save(entiProduto);
        return produto;
    }

    @Override
    public Produto editEstoque(Long id, Produto produto) {
        EntiProduto entiProduto = repoProduto.findById(id).get();
        entiProduto = ProdutoMapper.INSTANCE.toEnti(produto);
        repoProduto.save(entiProduto);
        return produto;
    }

    @Override
    public Boolean deleteProd(Long id) {
        EntiProduto entiProduto = repoProduto.findById(id).get();
        repoProduto.delete(entiProduto);
        return true;
    }

}
