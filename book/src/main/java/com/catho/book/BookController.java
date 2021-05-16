package com.catho.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/book")
public class BookController {
    @Autowired
    public BookRepository bookRepository;

    @GetMapping("/")
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{title}")
    public Book findByTitle(@PathVariable String title) {
        return bookRepository.findByTitle(title);
    }

    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
        bookRepository.deleteById(id);
    }

    @DeleteMapping("/")
    public void  deleteAll(){
        bookRepository.deleteAll();
    }

    @PostMapping("/")
    public Book save(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/")
    public Book update(@RequestBody Book book) {
        return bookRepository.save(book);
    }

}
