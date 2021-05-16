package com.catho.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long id;
    private String name;
    private Long age;
    private String category;
    private String userName;
    private String password;
    private String email;
    //nombre des livres empruntés
    private int nbrEmpr;

}
