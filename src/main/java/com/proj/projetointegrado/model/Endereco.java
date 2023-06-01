package com.proj.projetointegrado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private long idendereco;
    private String endereco;
    private String bairo;
}
