package com.proj.projetointegrado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private Long id;
    private String imageBlob;
    private String nomeProd;
    private Float precoCompra;
    private Float precoVenda;
    private Number quantidade;
    private Number min;
    private Fornecedor fornecedor;
}
