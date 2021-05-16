package com.catho.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    /*@Autowired
    public BookRepository bookRepository;*/

    @GetMapping("/")
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/search/{userName}")
    public Mono<User> findByUserName(@PathVariable String userName) {
        return userRepository.findByUserName(userName);
    }

    @GetMapping("/{id}")
    public Mono<User> getById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void>  deleteById(@PathVariable Long id){
       return userRepository.deleteById(id);
    }

    @DeleteMapping("/")
    public Mono<Void>  deleteAll(){
      return  userRepository.deleteAll();
    }


    /*@PutMapping("/{userName}/{title}")
    public int borrow(@PathVariable String userName,@PathVariable String title) {
        Mono<User> foundedUser = userRepository.findByUserName(userName);
        Book foundedBook = bookRepository.findByTitle(title);

        if((foundedUser.getCategory().equals("enfant") && !foundedBook.getCategory().equals("enfant"))
                || (foundedUser.getCategory().equals("adulte") && foundedBook.getCategory().equals("ado"))
                || (foundedUser.getNbrEmpr()>=3)){
            return -1;
        }
        else {
            foundedUser.setNbrEmpr(foundedUser.getNbrEmpr()+1);
            userRepository.save(foundedUser);
            foundedBook.setUser(foundedUser);
            bookRepository.save(foundedBook);

            return 1;
        }

    }*/

    @PostMapping("/")
    public Mono<User> save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/")
    public Mono<User> update(@RequestBody User user) {
        return userRepository.save(user);
    }
}
