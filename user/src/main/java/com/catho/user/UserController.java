package com.catho.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {

    @Autowired
    public final UserService userService;

    /*@Autowired
    public BookRepository bookRepository;*/

    @GetMapping("/")
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/search/{userName}")
    public Mono<User> findByUserName(@PathVariable String userName) {
        return userService.findByUserName(userName);
    }

    @GetMapping("/{id}")
    public Mono<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>  deleteById(@PathVariable Long id){
       return userService.deleteById(id);
    }


    @PostMapping("/")
    public Mono<User> save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/")
    public Mono<User> update(@RequestBody User user) {
        return userService.save(user);
    }
}
