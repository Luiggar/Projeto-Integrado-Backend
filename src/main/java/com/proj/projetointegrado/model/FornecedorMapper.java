package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiFornecedor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper

public interface FornecedorMapper {

    FornecedorMapper INSTANCE = Mappers.getMapper(FornecedorMapper.class);
    EntiFornecedor toEnti(Fornecedor fornecedor);
    List<Fornecedor> listFEnti(List<EntiFornecedor> entiFornecedor);

    Fornecedor fromEnti(EntiFornecedor entiFornecedor);
}
