package com.proj.projetointegrado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    private Long idfornecedor;
    private String nome;
    private String contato;
    private String info;
}
