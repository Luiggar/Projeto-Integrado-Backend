package com.proj.projetointegrado.controller;

import com.proj.projetointegrado.model.Pessoa;
import com.proj.projetointegrado.services.ServFunc;
import com.proj.projetointegrado.services.ServPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class ControlePessoa {
    @Autowired
    ServFunc servFunc;
    @Autowired
    ServPessoa servPessoa;


    @PostMapping("/cliente")
    public Pessoa createPessoa(@RequestBody Pessoa pessoa){
        return servPessoa.createPessoa(pessoa);
    }

    @GetMapping("/cliente")
    public List<Pessoa> getAllFunc(){
        return servPessoa.getAllPessoas();
    }

    @DeleteMapping("/cliente/{id}")
    public Map<String, Boolean> deleteFunc(@PathVariable Long id) {
        Boolean deleted = servPessoa.deletePessoa(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Estado da request :",deleted);
        return response;
    }
    @GetMapping("/cliente/{id}")
    public Pessoa getPesso(@PathVariable Long id) {
        return servPessoa.getPessoa(id);
    };

    @PostMapping("/cliente/{id}")
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoa){
        return servPessoa.atualizarPessoa(id, pessoa);
    }
    @PutMapping("/cliente/{id}")
    public Boolean isFunc(@PathVariable Long id) {
        return  servPessoa.isFunc(id);
    }

    @GetMapping("/cliente/find/{id}")
    public Long findFunc(@PathVariable Long id) { return servPessoa.findFuncId(id);}
}
