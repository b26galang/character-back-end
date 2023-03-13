package com.revature.service;

import com.revature.entity.Character;
import com.revature.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary

public class CharacterServiceImpl implements CharacterService{

    @Autowired
    CharacterRepository characterRepository;

    @Override
    public Character insert(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public Character getById(Long id) {
        return characterRepository.findById(id).get();
    }

    @Override
    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    @Override
    public Character update(Character character) {
        return characterRepository.save(character);
    }

    @Override
    public boolean delete(Long id) {
        boolean found = characterRepository.existsById(id);
        if(found) characterRepository.deleteById(id);
        return found;
    }

    @Override
    public List<Character> getAll(String flag) {
        if (flag != null) {
            return characterRepository.findAllByJob(flag);
        } else {
            return characterRepository.findAll();
        }
    }

//    @Override
//    public List<Character> getAll(String flag) {
//        return switch (flag) {
//            case "thieves" -> characterRepository.findThieves();
//            case "pirates" -> characterRepository.findPirates();
//            case "magicians" -> characterRepository.findMagicians();
//            case "archers" -> characterRepository.findArchers();
//            case "warriors" -> characterRepository.findWarriors();
//            default -> characterRepository.findAll();
//        };
//    }


    @Override
    public List<Character> findByName(String name) {
        return characterRepository.findByName(name);
    }
}
