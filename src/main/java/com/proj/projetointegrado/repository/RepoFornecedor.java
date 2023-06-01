package com.proj.projetointegrado.repository;

import com.proj.projetointegrado.entity.EntiFornecedor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RepoFornecedor extends JpaRepository<EntiFornecedor, Long> {

}
