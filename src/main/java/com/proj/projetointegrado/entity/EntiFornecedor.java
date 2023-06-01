package com.proj.projetointegrado.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Transactional
@Table(name = "fornecedor")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EntiFornecedor {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idfornecedor;
   private String nome;
   private String contato;
   private String info;
}
