package com.example.udemy.spring5demowebapp.model.repositories;

import com.example.udemy.spring5demowebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublishersRepository extends CrudRepository<Publisher, Long> {
}
