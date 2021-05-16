package com.catho.comment;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/comment")
@AllArgsConstructor
public class CommentController {
    @Autowired
    private final CommentService commentService;

    @GetMapping
    public Flux<Comment> getAllComments() {
        return commentService.findAll();
    }

    @GetMapping("/{title}")
    public Mono<Comment> findByTitle(@PathVariable String title) {
        return commentService.findByTitle(title);
    }

    @GetMapping("/{id}")
    public Mono<Comment> findById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public  Mono<Void>  deleteById(@PathVariable Long id){
      return  commentService.deleteById(id);
    }


    @PostMapping("/")
    public Mono<Comment> save(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

    @PutMapping("/")
    public Mono<Comment> update(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

}



