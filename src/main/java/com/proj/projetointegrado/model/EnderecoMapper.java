package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiEndereco;
import org.mapstruct.Mapper;

@Mapper
public interface EnderecoMapper {
    EntiEndereco toEnty(Endereco endereco);
}
