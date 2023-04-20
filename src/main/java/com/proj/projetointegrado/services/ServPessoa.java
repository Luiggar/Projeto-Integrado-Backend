package com.proj.projetointegrado.services;

import com.proj.projetointegrado.model.Pessoa;

import java.util.List;

public interface ServPessoa {

    Pessoa createPessoa(Pessoa pessoa);

    List<Pessoa> getAllPessoas();

    Pessoa getPessoa(Long id);

    Boolean deletePessoa(Long id);

    Pessoa atualizarPessoa(Long id, Pessoa pessoa);

    Boolean isFunc(Long id);

    Long findFuncId(Long id);
}


