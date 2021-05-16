package com.catho.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "book")
public interface BookRepository extends JpaRepository<Book, Long> {

    <S extends Book> S save(S book);

    public Book findByTitle (String title);

    public void  deleteById(Long id);

    public void  deleteAll();
}
