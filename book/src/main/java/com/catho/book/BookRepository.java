package com.catho.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Mono;


public interface BookRepository extends ReactiveCrudRepository<Book, Long> {

    public Mono<Book> findByTitle (String title);


}
