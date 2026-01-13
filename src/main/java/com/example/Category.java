package com.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORIES")
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<CategoryItem> categories = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryItem> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryItem> categories) {
        this.categories = categories;
    }
}
