package com.revature.repository;

import com.revature.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    // For finding characters by job
    List<Character> findAllByJob(String job);
//    @Query(value = "SELECT * FROM character_table WHERE character_job='thief'", nativeQuery = true)
//    public List<Character> findThieves();
//    @Query(value = "SELECT * FROM character_table WHERE character_job='pirate'", nativeQuery = true)
//    public List<Character> findPirates();
//    @Query(value = "SELECT * FROM character_table WHERE character_job='magician'", nativeQuery = true)
//    public List<Character> findMagicians();
//    @Query(value = "SELECT * FROM character_table WHERE character_job='archer'", nativeQuery = true)
//    public List<Character> findArchers();
//    @Query(value = "SELECT * FROM character_table WHERE character_job='warrior'", nativeQuery = true)
//    public List<Character> findWarriors();

    List<Character> findByName(String name);
}
