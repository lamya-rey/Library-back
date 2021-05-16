package com.catho.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private Long id;

    private String title;

    private String category;

    private String cover;

    /*@ManyToOne
    @JoinColumn(name="userId")
    private User user;*/

}
