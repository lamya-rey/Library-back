package com.catho.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Mono;


public interface CommentRepository extends ReactiveCrudRepository<Comment,Long> {

    Mono<Comment> findByTitle (String title);

}

