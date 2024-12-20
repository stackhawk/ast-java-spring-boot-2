package com.example.ast.annotation.category;

import com.example.ast.annotation.category.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryDAO {
    Optional<Category> findById(int id);
    List<Category> findAll();
    Category create(Category category);
    Category update(Category category, int id);
    void delete(int id_category);
    long count();
}
