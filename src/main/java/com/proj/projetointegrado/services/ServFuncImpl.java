package com.proj.projetointegrado.services;

import com.proj.projetointegrado.entity.EntiFunc;
import com.proj.projetointegrado.model.Func;
import com.proj.projetointegrado.model.FuncMapper;
import com.proj.projetointegrado.repository.RepoEndereço;
import com.proj.projetointegrado.repository.RepoFunc;
import com.proj.projetointegrado.repository.RepoPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Service
public class ServFuncImpl implements ServFunc{
    @Autowired
    RepoFunc repoFunc;
    @Autowired
    RepoPessoa repoPessoa;
    @Autowired
    RepoEndereço repoEndereço;


    @PostMapping("/func")
    public Func createFunc(Func func){
        System.out.println(func);
        EntiFunc entiFunc = FuncMapper.INSTANCE.ToEnti(func);
        repoFunc.save(entiFunc);
        return func;
    }

    @Override
    public List<Func> getAllFunc() {
        List<EntiFunc> listEnt = repoFunc.findAll(Sort.by(Sort.Direction.ASC, "pessoa.nomePessoa"));
        List<Func> listFunc = FuncMapper.INSTANCE.ListFromEnti(listEnt);
        return listFunc;
    }

    @Override
    public Func getFunc(Long id) {
        EntiFunc entiFunc =  repoFunc.findById(id).get();
        System.out.println(entiFunc);
        Func func = FuncMapper.INSTANCE.toFunc(entiFunc);
        System.out.println(func);
        return func;
    }

    @Override
    public Boolean deleteFunc(Long id) {
        EntiFunc entiFunc = repoFunc.findById(id).get();
        repoFunc.delete(entiFunc);
        return true;
    }

    @Override
    public Func atualizarFunc(Long id, Func func) {
        EntiFunc entiFunc = FuncMapper.INSTANCE.ToEnti(func);
        repoFunc.save(entiFunc);
        return func;
    }


}
