package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiPessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {EnderecoMapper.class})
public interface PessoaMapper {
    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);
    EntiPessoa toEnntity(Pessoa pessoa);
    Pessoa fromEnty(EntiPessoa entiPessoa);
    List<Pessoa> ListFromEnti(List<EntiPessoa> pessoaList);

}
