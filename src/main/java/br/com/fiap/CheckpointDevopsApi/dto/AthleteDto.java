package br.com.fiap.CheckpointDevopsApi.dto;

import br.com.fiap.CheckpointDevopsApi.model.Athletes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AthleteDto {

    private String name;

    private String description;

    private Integer age;

    private Double weight;

    private String country;

    private String categoryName;

    public AthleteDto(Athletes athlete) {
        name = athlete.getName();
        description = athlete.getDescription();
        age = athlete.getAge();
        weight = athlete.getWeight();
        country = athlete.getCountry();
        categoryName = athlete.getCategory().getCategoryName();
    }
}
