package com.example.randombook.category;

import com.example.randombook.book.Book;

import java.util.List;
import java.util.Optional;

public interface CategoryDAO {
    Optional<Category> findById(int id_category);
    List<Category> findAll();
    Category create(Category category);
    Category update(Category category);
    void delete(int id_category);
    long count();
}