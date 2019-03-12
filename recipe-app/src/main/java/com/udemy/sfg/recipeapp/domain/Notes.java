package com.udemy.sfg.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    private String recipeNotes;

}
