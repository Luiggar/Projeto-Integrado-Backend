package com.proj.projetointegrado.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Transactional
@Table(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
public class EntiEndereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idendereco;
    private String endereco;
    private String bairo;

}
