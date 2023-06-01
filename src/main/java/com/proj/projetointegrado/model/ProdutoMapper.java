package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiProduto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {FornecedorMapper.class})
public interface ProdutoMapper {
    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);
    EntiProduto toEnti(Produto produto);
    List<Produto> listFromEnti(List<EntiProduto> prodList);
    Produto fromEnti(EntiProduto entiProduto);

    List<EntiProduto> listToEnti(List<Produto> produtos);
}
