package com.example.udemy.spring5demowebapp.bootstrap;

import com.example.udemy.spring5demowebapp.model.Author;
import com.example.udemy.spring5demowebapp.model.Book;
import com.example.udemy.spring5demowebapp.model.Publisher;
import com.example.udemy.spring5demowebapp.model.repositories.AuthorsRepository;
import com.example.udemy.spring5demowebapp.model.repositories.BooksRepository;
import com.example.udemy.spring5demowebapp.model.repositories.PublishersRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorsRepository authorsRepository;
    private BooksRepository booksRepository;
    private PublishersRepository publishersRepository;

    public DevBootstrap(AuthorsRepository authorsRepository, BooksRepository booksRepository, PublishersRepository publishersRepository) {
        this.authorsRepository = authorsRepository;
        this.booksRepository = booksRepository;
        this.publishersRepository = publishersRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author john = new Author("John", "Jackson");
        Publisher test1 = new Publisher("5678");
        Book testBook = new Book("TestBook","Publisher",test1);
        john.getBooks().add(testBook);
        testBook.getAuthors().add(john);
        authorsRepository.save(john);
        booksRepository.save(testBook);
        publishersRepository.save(test1);

        Author jack = new Author("Jack", "Johnson");
        Publisher test2 = new Publisher("1234");
        Book testBook2 = new Book("TestBook2","Publisher2", test2);
        jack.getBooks().add(testBook2);
        testBook2.getAuthors().add(jack);
        authorsRepository.save(jack);
        booksRepository.save(testBook2);
        publishersRepository.save(test2);
    }
}
