package br.com.fiap.CheckpointDevopsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.CheckpointDevopsApi.model.Athletes;

public interface AthletesRepository extends JpaRepository<Athletes, Long> {
    
}
