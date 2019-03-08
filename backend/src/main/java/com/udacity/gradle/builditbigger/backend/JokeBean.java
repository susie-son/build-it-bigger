package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.joke.Joke;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    public String getJoke() {
        return Joke.generateJoke();
    }

}