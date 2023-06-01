package com.proj.projetointegrado.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    private Long id;
    private String nomePessoa;
    private String numPessoa;
    private String emailPessoa;
    private String docPessoa;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthPessoa;
    private Endereco endereco;


}
