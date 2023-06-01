package com.proj.projetointegrado.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;

@Entity
@Data
@Transactional
@Table(name = "produto")


public class EntiProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = Integer.MAX_VALUE, nullable = true)
    private String imageBlob;
    private String nomeProd;
    private Float precoCompra;
    private Float precoVenda;
    private Number quantidade;
    private Number min;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, optional = false)
    @JoinColumn(name = "idfornecedor")
    private EntiFornecedor fornecedor;
}
