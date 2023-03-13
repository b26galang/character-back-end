package com.revature.service;

import com.revature.entity.Character;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CharacterServiceDummyImpl implements CharacterService {
    @Override
    public Character insert(Character character) {
        // manually update id and return it
        character.setId(20l);
        return character;
    }

    @Override
    public Character getById(Long id) {
        // return a fake pet with that same id:
        return new Character(id, "Sam", "archer", "bow", false);
    }

    @Override
    public List<Character> getAll() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Character(1l, "Sera", "archer", "crossbow", true));
        characters.add(new Character(2l, "Arwen", "magician", "wand", true));
        characters.add(new Character(3l, "Estelle", "magician", "staff", false));
        return characters;
    }

    @Override
    public Character update(Character character) {
        return character;
    }

    @Override
    public boolean delete(Long id) {
        if (id == 1) return true;
        else return false;
    }

    @Override
    public List<Character> getAll(String flag) {
        return null;
    }

    @Override
    public List<Character> findByName(String name) {
        return null;
    }
}
