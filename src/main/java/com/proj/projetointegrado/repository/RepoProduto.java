package com.proj.projetointegrado.repository;

import com.proj.projetointegrado.entity.EntiProduto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface RepoProduto extends JpaRepository<EntiProduto, Long> {

    public List<EntiProduto> findAllByFornecedorIdfornecedor(Long id);
}
