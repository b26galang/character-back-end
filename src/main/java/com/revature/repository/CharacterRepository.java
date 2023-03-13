package com.revature.repository;

import com.revature.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    // For finding characters by job
    List<Character> findAllByJob(String job);
    List<Character> findByName(String name);
}
