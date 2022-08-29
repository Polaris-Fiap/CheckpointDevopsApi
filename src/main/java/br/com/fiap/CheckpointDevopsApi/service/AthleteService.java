package br.com.fiap.CheckpointDevopsApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.CheckpointDevopsApi.model.Athletes;
import br.com.fiap.CheckpointDevopsApi.repository.AthletesRepository;

@Service
public class AthleteService {
    
    @Autowired
    AthletesRepository repository;

    public List<Athletes> listAll() {
        return repository.findAll();
    }

    public void save(Athletes athlete) {
        repository.save(athlete);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Athletes> getById(Long id) {
        return repository.findById(id);
    }

}
