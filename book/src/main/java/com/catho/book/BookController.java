package com.catho.book;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/book")
@AllArgsConstructor
public class BookController {

    @Autowired
    public final BookService bookService;

    @GetMapping("/")
    public Flux<Book> getAllBooks() {
        return bookService.findAll();
    }


    @GetMapping("/{id}")
    public Mono<Book> findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/{title}")
    public Mono<Book> findByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>  deleteById(@PathVariable Long id){
       return bookService.deleteById(id);
    }


    @PostMapping("/")
    public Mono<Book> save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping("/")
    public Mono<Book> update(@RequestBody Book book) {
        return bookService.save(book);
    }

}
