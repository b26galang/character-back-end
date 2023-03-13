package com.revature.controller;

import com.revature.entity.Character;
import com.revature.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// every single method in this class should be prefixed with /pets
@RequestMapping("/characters")
@CrossOrigin(origins = "http://localhost:3000")
public class CharacterController {
    @Autowired
    CharacterService characterService;


    // we do a post mapping for inserting new data
    @PostMapping()
    public Character insert(@RequestBody Character character) {
        return characterService.insert(character);
    }

    // configuring this method to run when we send a get request to the end point /characters
    // http://localhost:8081/characters => [list of characters]
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Character> getAll(@RequestParam(required = false, value = "flag") String flag) {
        // if we don't pass in a request parameter flag, we should just get all characters
        if(flag == null) return characterService.getAll();
            // Otherwise, call the overloaded method:
        else return characterService.getAll(flag);
    }
    @GetMapping("/{characterIdentifier}")
    public Character getByIdOrName(@PathVariable("characterIdentifier") String identifier) {
        try {
            Long id = Long.parseLong(identifier);
            return characterService.getById(id);
        } catch(Exception e) {
            return characterService.findByName(identifier).get(0);
        }
    }

    @PutMapping()
    public Character update(@RequestBody Character character) {
        return characterService.update(character);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return characterService.delete(id);
    }
}
