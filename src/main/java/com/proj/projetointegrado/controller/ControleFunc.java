package com.proj.projetointegrado.controller;

import com.proj.projetointegrado.model.Func;
import com.proj.projetointegrado.services.ServFunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ControleFunc {
    @Autowired
    ServFunc servFunc;


    @PostMapping("/func")
    public Func createFunc(@RequestBody Func func){
        return servFunc.createFunc(func);
    }

    @GetMapping("/func")
    public List<Func> getAllFunc(){
        return servFunc.getAllFunc();
    }

    @DeleteMapping("/func/{id}")
    public Map<String, Boolean> deleteFunc(@PathVariable Long id) {
        Boolean deleted = servFunc.deleteFunc(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Estado da request :",deleted);
        return response;
    }
    @GetMapping("/func/{id}")
    public Func getFunc(@PathVariable Long id) {
        return servFunc.getFunc(id);
    }

    @PostMapping("/func/{id}")
    public Func atualizarFunc(@PathVariable Long id, @RequestBody Func func){
        return servFunc.atualizarFunc(id, func);
    }
}
