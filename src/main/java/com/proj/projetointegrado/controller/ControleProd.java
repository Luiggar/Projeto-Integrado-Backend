package com.proj.projetointegrado.controller;

import com.proj.projetointegrado.model.Fornecedor;
import com.proj.projetointegrado.model.Produto;
import com.proj.projetointegrado.services.ServFornecedor;
import com.proj.projetointegrado.services.ServProd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class ControleProd {
    @Autowired
    ServProd servProd;

    @Autowired
    ServFornecedor servFornecedor;

    @PostMapping("/produtos")
    public Produto createProd(@RequestBody Produto produto) {
        return servProd.createProduto(produto);
    }
    @GetMapping("/produtos")
    public List<Produto> getAllProd(){
        return servProd.getAllProduto();
    }
    @GetMapping("/produtos/{id}")
    public Produto getProduto(@PathVariable Long id) {
        return servProd.getProduto(id);
    }

    @GetMapping("/fornecedor")
    public List<Fornecedor> getAllFor() { return  servFornecedor.getAllFornecedor();}

    @PostMapping("/fornecedor")
    public Fornecedor addFor(@RequestBody Fornecedor fornecedor){return servFornecedor.addFornecedor(fornecedor);}

    @PutMapping("/fornecedor")
    public List<Produto> findProds(@RequestBody Fornecedor fornecedor) {return  servFornecedor.findProOfFor(fornecedor);}

    @GetMapping("/fornecedor/{id}")
    public Fornecedor getForId(@PathVariable Long id){ return servFornecedor.getFornecedor(id);}

    @PostMapping("/fornecedor/{id}")
    public Fornecedor atualizarFor(@PathVariable Long id, @RequestBody Fornecedor fornecedor){
        return servFornecedor.updateFor(id,fornecedor);
    }

    @PostMapping("produtos/{id}/edit")
    public Produto editEstoque(@PathVariable Long id, @RequestBody Produto produto) {
        return servProd.editEstoque(id, produto);
    }

    @DeleteMapping("/produtos/{id}")
    public Boolean deleteProd(@PathVariable Long id) { return servProd.deleteProd(id);}
}
