package com.proj.projetointegrado.model;

import com.proj.projetointegrado.entity.EntiFunc;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {PessoaMapper.class})
public interface FuncMapper {
    FuncMapper INSTANCE = Mappers.getMapper(FuncMapper.class);

    EntiFunc ToEnti(Func func);
    List<Func> ListFromEnti(List<EntiFunc> funcList);

    Func toFunc(EntiFunc entiFunc);

}
