package com.proj.projetointegrado.services;

import com.proj.projetointegrado.entity.EntiFunc;
import com.proj.projetointegrado.entity.EntiPessoa;
import com.proj.projetointegrado.model.Pessoa;
import com.proj.projetointegrado.model.PessoaMapper;
import com.proj.projetointegrado.repository.RepoEndereco;
import com.proj.projetointegrado.repository.RepoFunc;
import com.proj.projetointegrado.repository.RepoPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServPessoaImpl implements ServPessoa{
    @Autowired
    RepoFunc repoFunc;
    @Autowired
    RepoPessoa repoPessoa;
    @Autowired
    RepoEndereco repoEndereco;


    @Override
    public Pessoa createPessoa(Pessoa pessoa){
        EntiPessoa entiPessoa = PessoaMapper.INSTANCE.toEnntity(pessoa);
        repoPessoa.save(entiPessoa);
        return pessoa;
    }

    @Override
    public List<Pessoa> getAllPessoas() {
        List<EntiPessoa> listEnt = repoPessoa.findAll(Sort.by(Sort.Direction.ASC,"nomePessoa"));
        List<Pessoa> listPessoa = PessoaMapper.INSTANCE.ListFromEnti(listEnt);
        return listPessoa;
    }

    @Override
    public Pessoa getPessoa(Long id) {
        EntiPessoa entiPessoa =  repoPessoa.findById(id).get();
        System.out.println(entiPessoa);
        Pessoa pessoa = PessoaMapper.INSTANCE.fromEnty(entiPessoa);
        System.out.println();
        return pessoa;
    }

    @Override
    public Boolean deletePessoa(Long id) {
        if(isFunc(id)){

            EntiFunc entiFunc =repoFunc.findBypessoaId(id);
            repoFunc.delete(entiFunc);
            System.out.println(entiFunc);
        }

        EntiPessoa entiPessoa = repoPessoa.findById(id).get();
        repoPessoa.delete(entiPessoa);

        return true;
    }

    @Override
    public Pessoa atualizarPessoa(Long id, Pessoa pessoa) {
        EntiPessoa entiPessoa = repoPessoa.findById(id).get();
        entiPessoa = PessoaMapper.INSTANCE.toEnntity(pessoa);
        repoPessoa.save(entiPessoa);
        return pessoa;
    }

    @Override
    public Boolean isFunc(Long id) {
        return repoFunc.existsBypessoaId(id);
    }

    @Override
    public Long findFuncId(Long id) {
        return repoFunc.findBypessoaId(id).getId();
    }


}
