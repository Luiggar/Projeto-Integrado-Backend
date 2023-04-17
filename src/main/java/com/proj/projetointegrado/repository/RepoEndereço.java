package com.proj.projetointegrado.repository;

import com.proj.projetointegrado.entity.EntiEndereço;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RepoEndereço extends JpaRepository<EntiEndereço, Long> {
}
