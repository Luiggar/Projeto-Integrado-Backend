package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiPessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EndereçoMapper.class})
public interface PessoaMapper {
    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);
    EntiPessoa toEnntity(Pessoa pessoa);

}
