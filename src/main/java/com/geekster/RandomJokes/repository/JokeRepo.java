package com.geekster.RandomJokes.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class JokeRepo {
    ArrayList<String>jokes = new ArrayList<>();
    public String saveJoke(String joke) {
        jokes.add(joke);
        return "joke saved";
    }

    public String findJoke() {
        int randomNumber= (int) (Math.random() * ((jokes.size() - 1) + 1));
        return jokes.get(randomNumber);
    }
}
