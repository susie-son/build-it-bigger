package com.udacity.gradle.builditbigger.joke;

import java.util.Random;

public class Joke {

    private static final String[] jokes = {
            "Why don't polar bears get married? They all have cold feet.",
            "Why do astronaut bees get married? So they can go on honeymoon.",
            "The past, the present, and the future walk into a bar. It was tense.",
            "What do cats eat for breakfast? Mice Krispies.",
            "What do you call an alphabet letter who thinks it's a bird? A blue jay.",
            "What do you get from a pampered cow? Spoiled milk.",
            "How do you keep warm in a cold room? You go to the corner because it's 90 degrees.",
            "Why can't you trust an atom? They make up everything.",
            "Where does a general keep his armies? In his sleevies.",
            "How do trees access the internet? They log in."
    };
    private static final Random generator = new Random();

    public static String generateJoke() {
        int randomNum = generator.nextInt(jokes.length);
        return jokes[randomNum];
    }

}
