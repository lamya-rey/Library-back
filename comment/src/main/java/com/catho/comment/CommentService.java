package com.catho.comment;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Transactional
@AllArgsConstructor
@Service
public class CommentService {
    @Autowired
    private final CommentRepository commentRepository;

    public Mono<Comment> findById(Long id){
        return commentRepository.findById(id);
    }

    public Mono<Comment> findByTitle(String title){
        return commentRepository.findByTitle(title);
    }

    public Flux<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Mono<Comment> save(Comment comment) {
        return commentRepository.save(comment);
    }

    public Mono<Void> deleteById(Long id) {
        return commentRepository.deleteById(id);
    }

    public Mono<Comment> update(Comment comment) {
        return commentRepository.save(comment);
    }
}
