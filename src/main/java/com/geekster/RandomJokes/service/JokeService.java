package com.geekster.RandomJokes.service;

import com.geekster.RandomJokes.repository.JokeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    @Autowired
    JokeRepo jokeRepo;
    
    public String saveJoke(String joke){
       return jokeRepo.saveJoke(joke);
    }

    public String getJoke() {
        return jokeRepo.findJoke();
    }
}
