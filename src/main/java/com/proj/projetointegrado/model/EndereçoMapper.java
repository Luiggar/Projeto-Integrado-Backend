package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiEndereço;
import org.mapstruct.Mapper;

@Mapper
public interface EndereçoMapper {
    EntiEndereço toEnty(Endereço endereço);
}
