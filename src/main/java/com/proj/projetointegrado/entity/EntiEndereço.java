package com.proj.projetointegrado.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

@Entity
@Data
@Transactional
@Table(name = "endereco")
public class EntiEndereço {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idendereco;
    private String endereco;
    private String bairo;

}
