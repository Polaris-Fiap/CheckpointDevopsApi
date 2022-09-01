package br.com.fiap.CheckpointDevopsApi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.CheckpointDevopsApi.dto.AthleteDto;
import br.com.fiap.CheckpointDevopsApi.model.Athletes;
import br.com.fiap.CheckpointDevopsApi.repository.AthletesRepository;

@Service
public class AthleteService {
    
    @Autowired
    AthletesRepository repository;

    public List<Athletes> listAll() {
        return repository.findAll();
    }

    public List<AthleteDto> listDtos() {
        return repository.findAll()
                        .stream()
                        .map(this::convertDto)
                        .collect(Collectors.toList());
    }

    @Transactional
    public void save(Athletes athlete) {
        repository.save(athlete);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Athletes> getById(Long id) {
        return repository.findById(id);
    }

    private AthleteDto convertDto(Athletes athlete) {
        AthleteDto dto = new AthleteDto();
        dto.setName(athlete.getName());
        dto.setDescription(athlete.getDescription());
        dto.setAge(athlete.getAge());
        dto.setWeight(athlete.getWeight());
        dto.setCountry(athlete.getCountry());
        dto.setCategoryName(athlete.getCategory().getCategoryName());
        return dto;
    }

}
