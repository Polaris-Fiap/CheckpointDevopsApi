package br.com.fiap.CheckpointDevopsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.CheckpointDevopsApi.model.CategoryChampionship;

public interface CategoryRepository extends JpaRepository<CategoryChampionship, Long>{
    
}
