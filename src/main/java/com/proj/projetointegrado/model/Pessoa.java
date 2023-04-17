package com.proj.projetointegrado.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Pessoa {

    private Long id;
    private String nomePessoa;
    private Long numPessoa;
    private String emailPessoa;
    private String docPessoa;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthPessoa;
    private Endereço endereço;


}
