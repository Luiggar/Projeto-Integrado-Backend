package com.proj.projetointegrado.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Transactional
@Table(name = "pessoa")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntiPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomePessoa;
    private String numPessoa;
    private String emailPessoa;
    private String docPessoa;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthPessoa;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idendereco")
    private EntiEndereço endereço;


}
