package com.catho.book;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class BookService {

    @Autowired
    private final BookRepository bookRepository;

    public Mono<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public Mono<Book> findByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

    public Mono<Book> save(Book book) {
        return bookRepository.save(book);
    }

    public Mono<Void> deleteById(Long id) {
        return bookRepository.deleteById(id);
    }

    public Mono<Book> update(Book book) {
        return bookRepository.save(book);
    }
}
