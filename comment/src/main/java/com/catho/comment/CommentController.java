package com.catho.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/comment")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public Flux<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @GetMapping("/{title}")
    public Mono<Comment> findByTitle(@PathVariable String title) {
        return commentRepository.findByTitle(title);
    }

    @DeleteMapping("/{id}")
    public  Mono<Void>  deleteById(@PathVariable Long id){
      return  commentRepository.deleteById(id);
    }

    @DeleteMapping("/")
    public Mono<Void>  deleteAll(){
       return commentRepository.deleteAll();
    }

    @PostMapping("/")
    public Mono<Comment> save(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    @PutMapping("/")
    public Mono<Comment> update(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

}



