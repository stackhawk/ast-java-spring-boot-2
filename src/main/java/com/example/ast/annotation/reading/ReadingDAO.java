package com.example.ast.annotation.reading;

import java.util.List;
import java.util.Optional;

public interface ReadingDAO {
    List<Reading> findAll();
    Optional<Reading> findById(int id_reading);
    List<Reading> findAllByCustomerId(int id_customer);
    List<Reading> findAllByBookId(int id_book);
    Reading create(Reading reading);
    Reading update(Reading reading, int id_reading);
    void delete(int id_reading);
    long count();
}
