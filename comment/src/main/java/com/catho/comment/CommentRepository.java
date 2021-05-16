package com.catho.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Mono;

@RepositoryRestResource( path = "comment")
public interface CommentRepository extends ReactiveCrudRepository<Comment,Long> {

    public Mono<Comment>  save(Comment comment);

    Mono<Comment> findByTitle (String title);

    public Mono<Void>  deleteById(Long id);

    public Mono<Void>  deleteAll();
}

