package com.catho.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RepositoryRestResource(path = "user")
public interface UserRepository extends ReactiveCrudRepository<User, Long> {

    Mono<User> save(User user);

    public  Mono<User> findByUserName(String userName);

    public Mono<Void> deleteById(Long id);

    public Mono<Void> deleteAll();
}