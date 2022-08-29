package br.com.fiap.CheckpointDevopsApi.dto;

import br.com.fiap.CheckpointDevopsApi.model.Category;

public class AthleteDto {

    private String name;

    private String description;

    private Integer age;

    private Double weight;

    private String country;

    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Category getCategoryName() {
        return category;
    }

    public void setCategoryName(Category category) {
        this.category = category;
    }
}
