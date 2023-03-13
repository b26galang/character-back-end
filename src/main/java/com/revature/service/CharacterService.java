package com.revature.service;

import com.revature.entity.Character;

import java.util.List;

public interface CharacterService {
    Character insert(Character character);
    Character getById(Long id);
    List<Character> getAll();
    Character update(Character character);
    boolean delete(Long id);

    List<Character> getAll(String flag);

    List<Character> findByName(String name);
}
