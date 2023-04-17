package com.proj.projetointegrado.repository;

import com.proj.projetointegrado.entity.EntiFunc;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RepoFunc  extends JpaRepository<EntiFunc, Long> {
}
