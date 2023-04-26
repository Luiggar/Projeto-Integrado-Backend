package com.proj.projetointegrado.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Func {
    private long id;
    private String profFunc;
    private Double salFunc;
    private Pessoa pessoa;
    private String imageblob;

}
