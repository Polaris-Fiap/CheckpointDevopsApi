package br.com.fiap.CheckpointDevopsApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.CheckpointDevopsApi.configuration.ModelMapperConfig;
import br.com.fiap.CheckpointDevopsApi.dto.AthleteDto;
import br.com.fiap.CheckpointDevopsApi.model.Athletes;
import br.com.fiap.CheckpointDevopsApi.service.AthleteService;

@RestController
@RequestMapping("/athlete")
public class AthleteController {
    
    @Autowired
    AthleteService service;

    @Autowired
    ModelMapperConfig modelMapper;

    // @PostMapping
    // public ResponseEntity<Athletes> saveAthletes(@RequestBody @Valid AthleteDto dto) {
    //     Athletes athlete = new Athletes();
    //     BeanUtils.copyProperties(dto, athlete);
    //     service.save(athlete);
    //     return ResponseEntity
    //             .status(HttpStatus.CREATED)
    //             .body(athlete);
    // }

    @PostMapping
    public ResponseEntity<Athletes> saveAthletes(@RequestBody @Valid Athletes athlete) {
        service.save(athlete);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(athlete);
    }

    @GetMapping
    public List<Athletes> index(Athletes  athlete) {
        return service.listAll();
    }

    @GetMapping("/athlete-dto")
    public List<AthleteDto> listDtos(){
        return service.listDtos();
    }
}
