package br.com.fiap.CheckpointDevopsApi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Athletes> athletes;

    public Category() {

    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(String categoryName, List<Athletes> athletes) {
        this.categoryName = categoryName;
        this.athletes = athletes;
    }
    
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Athletes> getathletes() {
        return athletes;
    }

    public void setAthletes(List<Athletes> athletes) {
        this.athletes = athletes;
    }
}
