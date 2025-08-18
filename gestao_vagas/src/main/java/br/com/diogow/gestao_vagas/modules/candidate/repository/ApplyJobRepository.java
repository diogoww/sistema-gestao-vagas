package br.com.diogow.gestao_vagas.modules.candidate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApplyJobRepository extends JpaRepository<ApplyJobRepository, UUID> {

}
