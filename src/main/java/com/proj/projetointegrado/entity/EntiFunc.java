package com.proj.projetointegrado.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

@Entity
@Data
@Transactional
@Table(name = "func")
public class EntiFunc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String profFunc;
    private Double salFunc;
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "id_pessoa")
    private EntiPessoa pessoa;



}
