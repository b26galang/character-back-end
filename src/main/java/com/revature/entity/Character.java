package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "character_table")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "character_name", unique = true)
    private String name;

    @Column(name = "character_job")
    private String job;

    @Column(name = "character_weapon")
    private String weapon;

    @Column(name = "character_favorite")
    private boolean favorite;

    public Character(String name, String job, String weapon, boolean favorite) {
        this.name = name;
        this.job = job;
        this.weapon = weapon;
        this.favorite = favorite;
    }
}
