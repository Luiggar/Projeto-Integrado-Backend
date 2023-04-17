package com.proj.projetointegrado.services;

import com.proj.projetointegrado.model.Func;

import java.util.List;

public interface ServFunc {

    Func createFunc(Func func);

    List<Func> getAllFunc();

    Func getFunc(Long id);

    Boolean deleteFunc(Long id);

    Func atualizarFunc(Long id, Func func);
}


