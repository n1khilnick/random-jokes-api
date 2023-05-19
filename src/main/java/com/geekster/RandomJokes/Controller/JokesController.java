package com.geekster.RandomJokes.Controller;

import com.geekster.RandomJokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {
    @Autowired
    JokeService jokeService;
     static ArrayList<String>jokesList= new ArrayList<>();
    @PostMapping(value="/jokes")
    public String saveJokes(@RequestBody String joke){

       return jokeService.saveJoke(joke);
    }
    @GetMapping(value="/joke")
    public String getJoke(){
        return jokeService.getJoke();
    }

}
